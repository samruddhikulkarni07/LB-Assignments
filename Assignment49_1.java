import java.util.*;

class ParkingSystem
{
    public int CalculateParkingCharges(int totalhours)
    {
        int charges = 0;

        if(totalhours < 0)
        {
            return -1;
        }

        if(totalhours <= 2)
        {
            charges = 20;
        }
        else if(totalhours > 2 && totalhours <= 10)
        {
            charges = 20 + ((totalhours - 2) * 10);
        }
        else
        {
            charges = 20 + 80 + 50;
            
        }

        return charges;

    }
}
class Assignment49_1
{
    public static void main(String A[])
    {
        int totalParkingHours = 0;
        int iRet = 0;
        

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter parking hours : ");
        totalParkingHours = sobj.nextInt();

        ParkingSystem pobj = new ParkingSystem();

        iRet = pobj.CalculateParkingCharges(totalParkingHours);

        if(iRet == -1)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("Total parking duration is : "+totalParkingHours+" hours");
            System.out.println("Total parking Fees "+iRet+" rupees");
        }

        
    }
}