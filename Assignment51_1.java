import java.util.*;

class HospitalSystem
{
    private int Days;
    private String WardType;
    private int MedicineBill;
    private int ConsultationFee;
    private String Insured;
    private int RoomChargePerDay;
    private int Insurence;
    private int ICUWardCost;
    private int totalBill;
    private int coveredInsurence;
    private int finalpay;

    public HospitalSystem(int days, String ward, int medicinebill, int consultationfee, String insured)
    {
        this.Days = days;
        this.WardType = ward;
        this.MedicineBill = medicinebill;
        this.ConsultationFee = consultationfee;
        this.Insured = insured;
        this.RoomChargePerDay = 500;
        this.Insurence = 50000;
        this.ICUWardCost = 2000;
        this.totalBill = 0;
        this.coveredInsurence = 0;
        this.finalpay = 0;

    }

    public int TotalBill()
    {
        if(WardType.equals("ICU"))
        {
            totalBill = ConsultationFee + MedicineBill + (Days * RoomChargePerDay) + ICUWardCost;
        }
        else
        {
            totalBill = ConsultationFee + MedicineBill + (Days * RoomChargePerDay);
        }
        return totalBill;
    }
    public int InsuranceCover()
    {
        if(Insured.equals("Yes"))
        {
            if(((totalBill * 70) / 100) < Insurence)
            {
                coveredInsurence = (totalBill * 70) / 100;
            }
            else
            {
                coveredInsurence = Insurence;
            }

        }
        else
        {
            coveredInsurence = 0;
        }
        
        return coveredInsurence;
    }
    public int FinalPay()
    {
        finalpay = totalBill - coveredInsurence;
        return finalpay;
    }
}
class Assignment51_1
{
    public static void main(String A[])
    {
        int Days = 0;
        String WardType = null;
        int MedicineBill = 0;
        int ConsultationFee = 0;
        String Insured = null;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("How many days the patient is in hospital : ");
        Days = sobj.nextInt();

        sobj.nextLine();

        System.out.println("Enter Ward Type (Normal / ICU) : ");
        WardType = sobj.nextLine();

        System.out.println("Enter medicine Bill : ");
        MedicineBill = sobj.nextInt();

        System.out.println("Enter consultation fee : ");
        ConsultationFee = sobj.nextInt();

        sobj.nextLine();

        System.out.println("You have insurence (Yes / No) : ");
        Insured = sobj.nextLine();


        HospitalSystem hobj = new HospitalSystem(Days, WardType, MedicineBill, ConsultationFee, Insured);

        System.out.println("Total hospital bill is : "+hobj.TotalBill());
        System.out.println("Insurance covered is : "+hobj.InsuranceCover());
        System.out.println("Final pay is : "+hobj.FinalPay());

       
        
    }
}