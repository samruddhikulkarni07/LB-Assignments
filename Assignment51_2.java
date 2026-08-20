import java.util.*;

class TicketSystem
{
    private int Distance;
    private String ClassType;
    private int bookingHoursBefore;
    private int age;
    private int BaseFare;
    private int ClassFare;
    private int Tatkal;
    private int Discount;
    private int finalFare;

    public TicketSystem(int d, String s, int b, int a)
    {
        this.Distance = d;
        this.ClassType = s;
        this.bookingHoursBefore = b;
        this.age = a;
        this.BaseFare = 0;
        this.ClassFare = 0;
        this.Tatkal = 0;
        this.Discount = 0;
        this.finalFare = 0;

    }

    public int BaseFareCalculation()
    {
        if(Distance <= 10)
        {
            BaseFare = 100;
        }
        else if(Distance > 10 && Distance <= 20)
        {
            BaseFare = 200;
        }
        else 
        {
            BaseFare = 300;
        }

        return BaseFare;
    }
    public int ClassFareCalculation()
    {
        if(ClassType.equals("Sleeper"))
        {
            ClassFare = 200;
        }
        else if(ClassType.equals("2AC"))
        {
            ClassFare = 300;
        }
        else
        {
            ClassFare = 400;
        }

        return ClassFare;
    }
    public int TatkalCharges()
    {
        if(bookingHoursBefore <= 24)
        {
            Tatkal = ((BaseFare + ClassFare) * 30) / 100;
        }
        else
        {
            Tatkal = 0;
        }

        return Tatkal;
    }
    public int DiscountCharges()
    {
        if(age > 60)
        {
            Discount = ((BaseFare + ClassFare + Tatkal) * 40) / 100;
        }
        else 
        {
            Discount = 0;
        }

        return Discount;
    }
    public int FinalFareCalculation()
    {
        finalFare = BaseFare + ClassFare + Tatkal + Discount;

        return finalFare;
    }
}
class Assignment51_2
{
    public static void main(String A[])
    {
        int Distance = 0;
        String ClassType = null;
        int bookingHoursBefore = 0;
        int age = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Distance in km : ");
        Distance = sobj.nextInt();

        sobj.nextLine();

        System.out.println("Enter class type (Sleeper / 3AC / 2AC) : ");
        ClassType = sobj.nextLine();

        System.out.println("Enter how many hoours before you booking ticket : ");
        bookingHoursBefore = sobj.nextInt();

        System.out.println("Enter your age: ");
        age = sobj.nextInt();

        TicketSystem tobj = new TicketSystem(Distance, ClassType, bookingHoursBefore, age);

        System.out.println("Base Fare is : "+tobj.BaseFareCalculation());
        System.out.println("Class Fare is : "+tobj.ClassFareCalculation());
        System.out.println("Tatkal rate is : "+tobj.TatkalCharges());
        System.out.println("Discount : "+tobj.DiscountCharges());
        System.out.println("Final Fare is : "+tobj.FinalFareCalculation());
    }
}