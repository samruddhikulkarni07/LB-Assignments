import java.util.*;

class WaterBill
{
    private double FixedMeterCharges;
    private double SlabsWiseCharges;
    private double Penalty;
    private double TotalBill;

    public WaterBill()
    {
        FixedMeterCharges = 100.0;
        SlabsWiseCharges = 0.0;
        Penalty = 0.0;
        TotalBill = 0.0;
    }

    public double CalculateBillAmount(int units, int weeksLate)
    {
        if(units == 0)
        {
            SlabsWiseCharges = 0;
        }
        else if(units > 0 && units <= 10)
        {
            SlabsWiseCharges = units * 5;
        }
        else if(units > 10 && units <= 20)
        {
            SlabsWiseCharges = (10 * 5) + ((units - 10) * 10);
        }
        else if(units > 20 && units <= 30)
        {
            SlabsWiseCharges = (10 * 5) + (10 * 10) + ((units - 20) * 20);
        }
        else
        {
            SlabsWiseCharges = (10 * 5) + (10 * 10) + (10 * 20) + ((units - 30) * 30);
        }


        if(weeksLate == 0)
        {
            Penalty = 0;
        }
        else if(weeksLate == 1)
        {
            Penalty = ((FixedMeterCharges + SlabsWiseCharges) * 2) / 100;
        }
        else if(weeksLate == 2)
        {
            Penalty = ((FixedMeterCharges + SlabsWiseCharges) * 4) / 100;
        }
        else if(weeksLate == 3)
        {
            Penalty = ((FixedMeterCharges + SlabsWiseCharges) * 6) / 100;
        }
        else if(weeksLate == 4)
        {
            Penalty = ((FixedMeterCharges + SlabsWiseCharges) * 8) / 100;
        }
        else if(weeksLate >= 5)
        {
            Penalty = ((FixedMeterCharges + SlabsWiseCharges) * 10) / 100;
        }


        TotalBill = FixedMeterCharges + SlabsWiseCharges + Penalty;

        return TotalBill;
        

    }
   
}
class Assignment51_4
{
    public static void main(String A[])
    {
        int units = 0;
        int weeksLate = 0;
        double dRet = 0.0;

        Scanner sobj = new Scanner(System.in);
        WaterBill wobj = new WaterBill();

        System.out.println("Enter how many units of water you have used : ");
        units = sobj.nextInt();

        System.out.println("Enter how many weeksLate you are paying bill : ");
        weeksLate = sobj.nextInt();

        dRet = wobj.CalculateBillAmount(units, weeksLate);

        System.out.println("Total Bill amount is : "+dRet);


        
    }
}