import java.util.*;

class IncomeTaxPortal
{
    public int TaxCalculation(int AnnualIncome)
    {
        int TotalTax = 0;

        if(AnnualIncome < 0)
        {
            return -1;
        }

        if(AnnualIncome <= 250000)
        {
            TotalTax = 0;
        }
        else if(AnnualIncome >= 250001 && AnnualIncome <= 500000)
        {
            TotalTax = (AnnualIncome * 5) / 100;
        }
        else if(AnnualIncome >= 500001 && AnnualIncome <= 1000000)
        {
            TotalTax = (AnnualIncome * 20) / 100;
        }
        else
        {
            TotalTax = (AnnualIncome * 30) / 100;

        }

        return TotalTax;
        
    }
}
class Assignment49_5
{
    public static void main(String A[])
    {
        int income = 0;
        int iRet = 0;
        
        Scanner sobj = new Scanner(System.in);
        IncomeTaxPortal iobj = new IncomeTaxPortal();
        
        System.out.println("Enter your annual income : ");
        income = sobj.nextInt();

        iRet = iobj.TaxCalculation(income);

        if(iRet == -1)
        {
            System.out.println("Invalid input : Income cannot be negative");
        }
        else
        {
            System.out.println("Annual Income : "+income+" Rs.");
            System.out.println("Total tax payable : "+iRet+" Rs.");
        }

        
    }
}