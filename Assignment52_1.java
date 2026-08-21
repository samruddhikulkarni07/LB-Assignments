import java.util.Scanner;

class Hotel
{
    public int BillCalculation(int days)
    {
        int totalBill = 0;

        if(days <= 0)
        {
            return -1;

        }

        totalBill = days * 3000;

        if(days > 7)
        {
            totalBill = totalBill - ((totalBill * 5) / 100);
        }

        return totalBill;
        
    }
}
class Assignment52_1
{
    public static void main(String A[])
    {
        int days = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        Hotel hobj = new Hotel();

        System.out.println("Enter number of days you stayed : ");
        days = sobj.nextInt();

        System.out.println("Total stay duration is : "+days);

        iRet = hobj.BillCalculation(days);

        if(iRet == -1)
        {
            System.out.println("Invalid input.");
            System.out.println("Number of days must be greater than 0");
        }
        else
        {
            System.out.println("Final Bill amount is : "+iRet);
        }




    }
}