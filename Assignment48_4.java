import java.util.*;

class ElectricityCompany
{
    public int CalculateBill(int consumed)
    {
        int TotalBill = 0;

        if(consumed < 0)
        {
            return -1;
        }

        if(consumed <= 100)
        {
            TotalBill = consumed * 5;
        }
        else if(consumed >100 && consumed <= 200)
        {
            TotalBill = ((consumed - 100) * 7) + 500;
        }
        else
        {
            TotalBill = ((consumed - 200) * 10) + 1200;
        }

        return TotalBill;
    }
}
class Assignment48_4
{
    public static void main(String A[])
    {
        int consumed = 0;
        int iRet = 0;
        
        Scanner sobj = new Scanner(System.in);
        ElectricityCompany eobj = new ElectricityCompany();

        System.out.println("Enter how many units you consumed : ");
        consumed = sobj.nextInt();

        iRet = eobj.CalculateBill(consumed);

        if(iRet == -1)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("Total unit consumed : "+consumed);
            System.out.println("Total Electricity Bill : "+iRet+" rupees");

        }
    }
}