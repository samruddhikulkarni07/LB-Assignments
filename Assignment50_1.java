import java.util.*;

class RideHailingApp
{
    public int TripFareCalculation(int iDistance, String PeakHours)
    {
        int TotalFare = 0;
        int BaseFare = 50;
        int FirstTen = 120;

        if(iDistance < 0)
        {
            return -1;
        }

        if(iDistance <= 10)
        {
            TotalFare = BaseFare + (iDistance * 12);
        }
        else
        {
            TotalFare = BaseFare + FirstTen + ((iDistance - 10 ) * 15);
        }

        if(PeakHours.equals("Yes"))
        {
            TotalFare = TotalFare + ((TotalFare * 20) / 100);
        }
        else
        {
            TotalFare = TotalFare + 0;
        }
        

        return TotalFare;
        
    }
}
class Assignment50_1
{
    public static void main(String A[])
    {
        int iDistance = 0;
        String PeakHours = null;
        int iRet = 0;
        
        Scanner sobj = new Scanner(System.in);
        RideHailingApp robj = new RideHailingApp();
        
        System.out.println("Enter distance in km : ");
        iDistance = sobj.nextInt();

        sobj.nextLine();


        System.out.println("Peak Hours (Yes / No) : ");
        PeakHours = sobj.nextLine();

        iRet = robj.TripFareCalculation(iDistance, PeakHours);

        if(iRet == -1)
        {
            System.out.println("Invalid input : Distance cannot be negative");
        }
        else
        {
            System.out.println("Distance : "+iDistance+" km");
            System.out.println("Peak hour : "+PeakHours);
            System.out.println("Total Fare: "+iRet+" Rs.");
        }

        
    }
}