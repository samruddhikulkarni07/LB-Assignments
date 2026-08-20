import java.util.*;

class Plan
{
    private String name;
    private double BaseCost;
    private int AvailableMins;
    private double AvailableGB;
    private int AvailableSMS;
    private double ExtraPerMins;
    private double ExtraPerGB;
    private double ExtraPerSMS;

    public Plan(String name, double BaseCost, int AvailableMins, double AvailableGB, int AvailableSMS, double ExtraPerMins, double ExtraPerGB, double ExtraPerSMS)
    {
        this.name = name;
        this.BaseCost = BaseCost;
        this.AvailableMins = AvailableMins;
        this.AvailableGB = AvailableGB;
        this.AvailableSMS = AvailableSMS;
        this.ExtraPerMins = ExtraPerMins;
        this.ExtraPerGB = ExtraPerGB;
        this.ExtraPerSMS = ExtraPerSMS;
    }

    public String getName()
    {
        return name;
    }

    public double CostCalculation(int mins, double gb, int sms)
    {
        double TotalCost = BaseCost;

        if(mins > AvailableMins)
        {
            TotalCost = TotalCost + ((mins - AvailableMins) * ExtraPerMins);
        }

        if(gb > AvailableGB)
        {
            TotalCost = TotalCost + ((gb - AvailableGB) * ExtraPerGB);
            
        }

        if(sms > AvailableSMS)
        {
            TotalCost = TotalCost + ((sms - AvailableSMS) * ExtraPerSMS);
        }


        return TotalCost;

    }
    
   
}
class Assignment51_3
{
    public static void main(String A[])
    {
        int mins = 0;
        double gb = 0.0;
        int sms = 0;

        Scanner sobj = new Scanner(System.in);

        ArrayList <Plan> PlanDetails = new ArrayList <Plan>();

        System.out.println("Enter calls in mins :");
        mins = sobj.nextInt();

        System.out.println("Enter data usage in GB :");
        gb = sobj.nextDouble();

        System.out.println("Enter sms :");
        sms = sobj.nextInt();

        Plan pobj1 = new Plan("Basic", 199.0, 100, 1.0, 50, 0.5, 20.0, 0.4);
        Plan pobj2 = new Plan("Smart", 349.0, 150, 2.0, 80, 0.4, 15.0, 0.3);
        Plan pobj3 = new Plan("Advance", 499.0, 200, 3.0, 100, 0.3, 12.0, 0.3);
        Plan pobj4 = new Plan("Premium", 799.0, 400, 6.0, 250, 0.2, 10.0, 0.2);

        PlanDetails.add(pobj1);
        PlanDetails.add(pobj2);
        PlanDetails.add(pobj3);
        PlanDetails.add(pobj4);

        double minimumCost = Double.MAX_VALUE;
        String Name = "";
        

        for(Plan pobj : PlanDetails)
        {
            double cost = pobj.CostCalculation(mins, gb, sms);

            if(minimumCost > cost)
            {
                minimumCost = cost;
                Name = pobj.getName();
            }
            
        }

        System.out.println("Recommended plan is : "+Name);
        System.out.println("Cost is : "+minimumCost);

        
    }
}