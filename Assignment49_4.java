import java.util.*;

class TrafficPoliceApp
{
    public int FineCalculation(String HelmetWorn, String LicenseAvailable, String Overspeeding)
    {
        int FineAmount = 0;

        if((!HelmetWorn.equals("Yes") && !HelmetWorn.equals("No")) ||
            (!LicenseAvailable.equals("Yes") && !LicenseAvailable.equals("No")) ||
            (!Overspeeding.equals("Yes") && !Overspeeding.equals("No")))
        {
            return -1;
        }

        if(HelmetWorn.equals("Yes") && LicenseAvailable.equals("Yes") && Overspeeding.equals("No"))
        {
            FineAmount = 0;
        }
        else if(HelmetWorn.equals("No") && LicenseAvailable.equals("Yes") && Overspeeding.equals("No"))
        {
            FineAmount = 500;
        }
        else if(HelmetWorn.equals("Yes") && LicenseAvailable.equals("No") && Overspeeding.equals("No"))
        {
            FineAmount = 1000;
        }
        else if(HelmetWorn.equals("Yes") && LicenseAvailable.equals("Yes") && Overspeeding.equals("Yes"))
        {
            FineAmount = 1500;
        }
        else if(HelmetWorn.equals("No") && LicenseAvailable.equals("No") && Overspeeding.equals("No"))
        {
            FineAmount = 500+1000;
        }
        else if(HelmetWorn.equals("No") && LicenseAvailable.equals("Yes") && Overspeeding.equals("Yes"))
        {
            FineAmount = 500 + 1500;
        }
        else if(HelmetWorn.equals("Yes") && LicenseAvailable.equals("No") && Overspeeding.equals("Yes"))
        {
            FineAmount = 1000 + 1500;
        }
        else
        {
            FineAmount = 500 + 1000 + 1500;
        }

        return FineAmount;
    }
}
class Assignment49_4
{
    public static void main(String A[])
    {
        
        String HelmetWorn = null;
        String LicenseAvailable = null;
        String Overspeeding = null; 
        int iRet = 0;
        
        Scanner sobj = new Scanner(System.in);
        TrafficPoliceApp tobj = new TrafficPoliceApp();

        System.out.println("Helmet worn (Yes / No) : ");
        HelmetWorn = sobj.nextLine();

        System.out.println("License available (Yes / No) : ");
        LicenseAvailable = sobj.nextLine();

        System.out.println("Overspeeding (Yes / No) : ");
        Overspeeding = sobj.nextLine();

        iRet = tobj.FineCalculation(HelmetWorn, LicenseAvailable,Overspeeding);

        if(iRet == -1)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("Total fine amount is : "+iRet+" Rupees");
        }

        
        
    }
}