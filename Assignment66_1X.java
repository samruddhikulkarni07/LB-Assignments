/*
Find Two Transactions Matching a Target

A customer made transactions:

1200 500 700 300 1500

Find whether two transactions have a combined value of:

2000

Output:

500 + 1500 = 2000
*/

import java.util.*;

class Assignment66_1X
{
    public static void main(String A[])
    {
        int Arr[] = {1200,500,700,300,1500};

        HashSet<Integer> seen = new HashSet<Integer>();

        boolean bFlag = false;

        for(int val : Arr)
        {
            int complement = 2000 - val;

            if(seen.contains(complement))
            {
                System.out.println(complement+" + "+val+" = "+2000);
                bFlag = true;
            }
            seen.add(val);
        }

        if(bFlag == false)
        {
            System.out.println("Target matching two transactions not found");
        }
    }
}