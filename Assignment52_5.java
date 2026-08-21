import java.util.*;

class TelecomCompany
{
    public int CalculateFinalCharges(int Minutes)
    {
        int TotalCharges = 0;

        if(Minutes <= 5)
        {
            TotalCharges = 0;
        }
        else if(Minutes > 5 && Minutes <= 15)
        {
            TotalCharges = (Minutes - 5) * 1;
        }
        else
        {
            TotalCharges = (10 * 1) + ((Minutes - 15) * 2);
        }

        return TotalCharges;
    }
    

    
}

class Assignment52_5
{
    public static void main(String A[])
    {
        int Minutes = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        TelecomCompany tobj = new TelecomCompany();

        System.out.println("Enter call duration in minutes : ");
        Minutes = sobj.nextInt();

        if(Minutes < 0)
        {
            System.out.println("Invalid input");
            return;
        }
        
        iRet = tobj.CalculateFinalCharges(Minutes);

        System.out.println("Call duration is : "+Minutes+" minutes");
        System.out.println("Total call charges are  : "+iRet+" Rs.");

        
        
    }
}