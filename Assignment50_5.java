import java.util.*;

class PhoneOS
{
    public String BatteryStatus(int BatteryPercentage)
    {
        if(BatteryPercentage <= 5)
        {
            return "Critical";
        }
        else if(BatteryPercentage > 5 && BatteryPercentage <= 15)
        {
            return "Low";
        }
        else
        {
            return "Normal";
        }
       
    }
}
class Assignment50_5
{
    public static void main(String A[])
    {
        int BatteryPercentage = 0;
        String sRet = null;
        
        Scanner sobj = new Scanner(System.in);
        PhoneOS pobj = new PhoneOS();
        
        System.out.println("Enter your mobile battery percentage : ");
        BatteryPercentage = sobj.nextInt();

        if(BatteryPercentage < 0 || BatteryPercentage > 100)
        {
            System.out.println("Invalid input");
            return;
        }

       sRet = pobj.BatteryStatus(BatteryPercentage);

       System.out.println("Battery Percentage : "+BatteryPercentage+" %");
       System.out.println("Status : "+sRet);

       
        
    }
}