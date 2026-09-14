/*
2. A messaging application wants to identify the first character in a message that occurs only once.

Input:

programming

Output:

First non-repeating character : p

The solution should preserve the original character order.
*/

import java.util.*;

class Assignment66_2
{
    public static void main(String A[])
    {
        
        if(A.length != 1)
        {
            System.out.println("Invalid number of arguments");
            return;
        }

        String str = A[0];

        LinkedHashMap <Character,Integer> frequency = new LinkedHashMap<Character,Integer>();

        for(char ch : str.toCharArray())
        {
            frequency.put(ch,frequency.getOrDefault(ch,0)+1);

        }

        for(char ch : frequency.keySet())
        {
            if(frequency.get(ch) == 1)
            {
                System.out.println("First Non repeating character : "+ch);
                break;
                
            }
        }
    }
}