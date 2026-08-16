import java.util.*;

class Shopping
{
    private int PurchaseAmount;
    private String MembershipType;
    private int NormalDiscount;
    private int PremiumDiscount;
    private int TotalDiscount;
    private int PayableAmount;

    public Shopping(int A, String str)
    {
        PurchaseAmount = A;
        MembershipType = str;
        NormalDiscount = 0;
        PremiumDiscount = 0;
        TotalDiscount = 0;
        PayableAmount = 0;
    }
    public int CalculateNormalDicount()
    {
        if(PurchaseAmount <= 0)
        {
            System.out.println("Invalid input");
            return -1;
        }

        if(PurchaseAmount > 5000)
        {
            NormalDiscount = (PurchaseAmount * 20) /100;
        }
        else if(PurchaseAmount > 2000 && PurchaseAmount <= 5000)
        {
            NormalDiscount = (PurchaseAmount * 10) /100;
        }
        else
        {
            NormalDiscount = 0;
        }

        return NormalDiscount;

    }
    public int CalculatePremiumDiscount()
    {

        if(MembershipType.equals("Premium"))
        {
            PremiumDiscount = ((PurchaseAmount - NormalDiscount) * 5) /100;

        }
        else
        {
            PremiumDiscount = 0;
        }

        return PremiumDiscount;

    }
    public int CalculateTotalDiscount()
    {
        TotalDiscount = NormalDiscount + PremiumDiscount;

        return TotalDiscount;
    }

    public int CalculatePayableAmount()
    {
        PayableAmount = PurchaseAmount - (NormalDiscount + PremiumDiscount);
        
        return PayableAmount;
    }
}
class Assignment48_5
{
    public static void main(String A[])
    {
        int PurchaseAmount = 0;
        String MembershipType = null;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter your purchase amount : ");
        PurchaseAmount = sobj.nextInt();
        sobj.nextLine();

        System.out.println("Enter MemberShip type : ");
        MembershipType = sobj.nextLine();

    
        Shopping hobj = new Shopping(PurchaseAmount, MembershipType);

        System.out.println("Total Purchase Amount is : "+PurchaseAmount);

        iRet = hobj.CalculateNormalDicount();
        System.out.println("Normal Discount is : "+iRet);

        iRet = hobj.CalculatePremiumDiscount();
        System.out.println("Premium Discount is : "+iRet);

        iRet = hobj.CalculateTotalDiscount();
        System.out.println("Total Discount is : "+iRet);

        iRet = hobj.CalculatePayableAmount();
        System.out.println("Final Payable amount : "+iRet);



    }
}