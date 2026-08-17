import java.util.*;

class Warehouse
{
    public int StockDetails(int CurrentStock, int RequestedQuantity)
    {
        int RemainingStock = 0;

        if(CurrentStock < 0 || RequestedQuantity <= 0)
        {
            return -1;
        }

        if(RequestedQuantity > CurrentStock)
        {
            return -2;
        }
        else
        {
            RemainingStock = CurrentStock - RequestedQuantity;

            return RemainingStock;
        }
    }
}
class Assignment49_3
{
    public static void main(String A[])
    {
        int CurrentStock = 0;
        int RequestedQuantity = 0;
        int iRet = 0;
        
        Scanner sobj = new Scanner(System.in);
        Warehouse wobj = new Warehouse();

        System.out.println("Enter current stock : ");
        CurrentStock = sobj.nextInt();

        System.out.println("Enter Requested quantity : ");
        RequestedQuantity = sobj.nextInt();

        iRet = wobj.StockDetails(CurrentStock, RequestedQuantity);

        if(iRet == -1)
        {
            System.out.println("Invalid input");
        }
        else if(iRet == -2)
        {
            System.out.println("Order failed : due to Insufficiet stock");
        }
        else
        {
            System.out.println("Order processed successsfully");
            System.out.println("Remaining stock is : "+iRet);

            if(iRet < 5)
            {
                System.out.println("Low stock available");
            }

        }
        
    }
}