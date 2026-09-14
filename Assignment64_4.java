/*
4. A banking application receives transaction IDs:

TX101
TX102
TX103
TX101
TX104
TX102

Identify duplicate transaction IDs.

Expected output:

Duplicate transactions:
TX101
TX102

*/

import java.util.*;

class Assignment66_4
{
    public static void main(String A[])
    {
        String Arr[] = {"TX101","TX102","TX103","TX101","TX104","TX102"};

        HashSet<String> unique = new HashSet<String>();
        HashSet<String> duplicate = new HashSet<String>();

        boolean bRet = false;

        for(String str : Arr)
        {
            bRet = unique.add(str);

            if(bRet == false)
            {
                duplicate.add(str);
            }
            
        }

        System.out.println("Duplicate transactions : ");

        for(String str : duplicate)
        {
            System.out.println(str);
        }
    }
}