import java.util.*;

class BankSystem
{
    public void BankLoan(int Age, int MonthlyIncome, int CreditScore, String ExistingUnpaidLoan)
    {
        if(Age < 0 || MonthlyIncome < 0 || CreditScore < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(!ExistingUnpaidLoan.equals("Yes") && !ExistingUnpaidLoan.equals("No"))
        {
            System.out.println("Invalid input");
            return;
        }

        if(Age < 21 || Age > 60)
        {
            System.out.println("Loan Rejected : because Your age not fit in our criteria");
        }
        else if(MonthlyIncome < 25000)
        {
            System.out.println("Loan Rejected : because Your Monthly income less than 25000");
        }
        else if(CreditScore < 700)
        {
            System.out.println("Loan Rejected : because Your credit score is less than 700");
        }
        else if(ExistingUnpaidLoan.equals("Yes"))
        {
            System.out.println("Loan Rejected : because you have existing unpaid loan");
        }
        else
        {
            System.out.println("Loan Approved");
        }

    }
}
class Assignment49_2
{
    public static void main(String A[])
    {
        int Age = 0;
        int MonthlyIncome = 0;
        int CreditScore = 0;
        String ExistingUnpaidLoan = null;
        
        Scanner sobj = new Scanner(System.in);
        BankSystem bobj = new BankSystem();

        System.out.println("Enter your Age : ");
        Age = sobj.nextInt();

        System.out.println("Enter your Monthly Income : ");
        MonthlyIncome = sobj.nextInt();

        System.out.println("Enter your Credit score : ");
        CreditScore = sobj.nextInt();

        sobj.nextLine();

        System.out.println("Enter your Existing Unpaid Loan status (Yes / No) : ");
        ExistingUnpaidLoan = sobj.nextLine();

    
        bobj.BankLoan(Age, MonthlyIncome, CreditScore, ExistingUnpaidLoan);
        
    }
}