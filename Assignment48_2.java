import java.util.*;

class Transaction
{
    public int AmountWithdrawl(int CurrentBal, int Withdrwal)
    {
        int iRemaining = 0;

        if(CurrentBal < 0 || Withdrwal <= 0)
        {
            return -1;
        }

        if((Withdrwal % 100 == 0) && (Withdrwal <= 25000) && (CurrentBal - Withdrwal >= 1000))
        {
            iRemaining = CurrentBal - Withdrwal;

            return iRemaining;
        
        }
        else
        {
            return 1;
        }



    }
}
class Assignment48_2
{
    public static void main(String A[])
    {
        int CurrentBal = 0;
        int Withdrwal = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        Transaction tobj = new Transaction();

        System.out.println("Enter your current balance : ");
        CurrentBal = sobj.nextInt();

        System.out.println("Enter amount which you want to withdraw : ");
        Withdrwal = sobj.nextInt();

        iRet = tobj.AmountWithdrawl(CurrentBal,Withdrwal);

        if(iRet == -1)
        {
            System.out.println("Invalid input");
        }
        else if(iRet == 1)
        {
            System.out.println("Transaction failed");

        }
        else
        {
            System.out.println("Transaction Successful");
            System.out.println("Your remaining balance is : "+iRet);
        } 
    }

}