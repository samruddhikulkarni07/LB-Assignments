/*
Given:

java python java c java python cpp

Generate:

java -> 3
python -> 2
c -> 1
cpp -> 1

Then find the most frequently occurring word.

Expected:

Most frequent word : java
Frequency : 3
*/

import java.util.*;

class Assignment65_4
{
    public static void main(String A[])
    {
        String Arr[] = {"java","python","java","c","java","python","cpp"};

        LinkedHashMap<String, Integer> hobj = new LinkedHashMap<String, Integer>();

        for(String str : Arr)
        {
            hobj.put(str,hobj.getOrDefault(str,0)+1);
        }

        for(Map.Entry<String, Integer> eobj : hobj.entrySet())
        {
            System.out.println(eobj.getKey()+" -> "+eobj.getValue());

        } 

        String MostFrequent = "";
        int Frequency = 0;

        for(Map.Entry<String, Integer> eobj : hobj.entrySet())
        {
            if(eobj.getValue() > Frequency)
            {
                MostFrequent = eobj.getKey();
                Frequency = eobj.getValue();
            }
        }

        System.out.println("Most frequent word : "+MostFrequent);
        System.out.println("Frequency : "+Frequency);
    }
}