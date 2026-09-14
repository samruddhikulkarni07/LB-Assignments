/*
3. An e-commerce warehouse maintains:

Product ID -> Available Quantity

Implement operations:

ADD 101 50
ADD 102 30
SELL 101 5
RESTOCK 102 20
SEARCH 101

Expected result:

Product 101 available quantity : 45

If a product doesn't exist, display an appropriate message.
*/

import java.util.*;

class Assignment66_3
{
    public static void main(String A[])
    {
        HashMap<Integer, Integer> hobj = new HashMap<Integer, Integer>();

        //ADD 101 50
        hobj.put(101,50);

        //ADD 102 30
        hobj.put(102,30);

        //SELL 101 5
        if(hobj.containsKey(101) && hobj.get(101) >= 5)
        {
            hobj.put(101,hobj.get(101) - 5);
        }

        //RESTOCK 102 20
        if(hobj.containsKey(102))
        {
            hobj.put(102,hobj.get(102)+20);
        }
        else
        {
            hobj.put(102,20);
        }

        //SEARCH 101
        if(hobj.containsKey(101))
        {
            System.out.println("Product 101 available quantity : "+hobj.get(101));
        }
        else
        {
            System.out.println("Product is not available");
        }
    }
}