import java.util.*;

class Store
{
    private int iCount;
    private double iRemainingBalance;

    public void Calculation(double BudgetAmount, int N, double Prices[])
    {
        iCount = 0;
        iRemainingBalance = BudgetAmount;
        int i = 0;

        for(i = 0; i < Prices.length; i++)
        {
            if(iRemainingBalance >= Prices[i])
            {
                iCount++;
                iRemainingBalance = iRemainingBalance - Prices[i];

            }
            else
            {
                break;
            }
        }
        
    }

    public int ItemsPurchased()
    {
        return iCount;
    }

    public double RemainingBalanceCount()
    {
        return iRemainingBalance;
    }

}
class Assignment50_4
{
    public static void main(String A[])
    {
        double BudgetAmount = 0;
        int N = 0;
        double Prices[] = null;
        
        Scanner sobj = new Scanner(System.in);
        Store tobj = new Store();

        System.out.println("Enter your budget amount : ");
        BudgetAmount = sobj.nextInt();

        if(BudgetAmount <= 0)
        {
            System.out.println("Invalid input : Budget amount should be greater than 0");
        }

        System.out.println("Enter Number of items : ");
        N = sobj.nextInt();

        if(N <= 0)
        {
            System.out.println("Invalid input : Number of items should be greater than 0");
        }

        Prices = new double[N];

        System.out.println("Enter price of each item : ");

        for(int i = 0; i < N; i++)
        {
            Prices[i] = sobj.nextInt();

            if(Prices[i] < 0)
            {
                System.out.println("Invalid input : price of each item should be greater than 0");
        
            }
        }

        tobj.Calculation(BudgetAmount, N, Prices);

        System.out.println("Total item Purchased : "+tobj.ItemsPurchased());
        System.out.println("Remaining Balance : "+tobj.RemainingBalanceCount());
        
        
    }
}