import java.util.*;

class CourierCounter
{
    public int CalculateDeliveryCharges(int weight)
    {
        int charges = 0;

        if(weight < 0)
        {
            return -1;
        }

        if(weight <= 1)
        {
            charges = 50;
        }
        else if(weight > 1 && weight <= 5)
        {
            charges = 50 + ((weight - 1) * 20);
        }
        else
        {
            charges = 150 + ((weight - 5) * 30);
        }
        
        return charges;
        
    }
}
class Assignment50_3
{
    public static void main(String A[])
    {
        int weight= 0;
        int iRet = 0;
        
        Scanner sobj = new Scanner(System.in);
        CourierCounter cobj = new CourierCounter();
        
        System.out.println("Enter weight of parcel : ");
        weight = sobj.nextInt();

       iRet = cobj.CalculateDeliveryCharges(weight);

       if(iRet == -1)
       {
           System.out.println("Invalid input");
       }
       else
       {
            System.out.println("Parcel weight : "+weight+" kg");
            System.out.println("Courier charges : "+iRet+" Rs.");
            
       }
        
    }
}