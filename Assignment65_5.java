/*
An e-commerce application records product IDs:

101 102 101 103 101 102 104 105 102 102 103

Find the top 2 most frequently purchased products.

Expected:

102 -> 4
101 -> 3
*/

import java.util.*;

class Assignment65_5
{
    public static void main(String A[])
    {
        int Arr[] = {101,102,101,103,101,102,104,105,102,102,103};

        HashMap<Integer, Integer> hobj = new HashMap<Integer, Integer>();

        for(int id : Arr)
        {
            hobj.put(id,hobj.getOrDefault(id,0)+1);
        }

        int FirstMostFrequent = 0;
        int Frequency1 = 0;

        int SecondMostFrequent = 0;
        int Frequency2 = 0;

        for(Map.Entry<Integer, Integer> eobj : hobj.entrySet())
        {
            if(eobj.getValue() > Frequency1)
            {
                FirstMostFrequent = eobj.getKey();
                Frequency1 = eobj.getValue();
            }

            
        }

        for(Map.Entry<Integer, Integer> eobj : hobj.entrySet())
        {
            if(eobj.getValue() > Frequency2 && eobj.getValue() < Frequency1)
            {
                SecondMostFrequent = eobj.getKey();
                Frequency2 = eobj.getValue();
            }

        }

        System.out.println(FirstMostFrequent+" -> "+Frequency1);
        System.out.println(SecondMostFrequent+" -> "+Frequency2);
    }
}