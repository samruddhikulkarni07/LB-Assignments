import java.util.*;

class Calculation
{
    public int TotalFine(int days)
    {
        int fineAmount = 0;

        if(days < 0)
        {
            return -1;
        }

        if(days <= 7)
        {
            fineAmount = 0;
        }
        else if(days >= 8 && days <= 12)
        {
            fineAmount = (days - 7) * 5;
        }
        else
        {
            fineAmount = ((days - 12) * 10) + 25;
            
        }

        return fineAmount;

    }
}
class Assignment48_1
{
    public static void main(String A[])
    {
        int daysKept = 0;
        int iRet = 0;
        

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter how many days you kept book : ");
        daysKept = sobj.nextInt();

        Calculation cobj = new Calculation();

        iRet = cobj.TotalFine(daysKept);

        if(iRet == -1)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("You have to pay "+iRet+" rupees");
        }

        
    }
}