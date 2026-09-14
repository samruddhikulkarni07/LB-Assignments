/*
A browser wants to store only the last 5 visited websites.

Visits:

google.com
github.com
openai.com
oracle.com
stackoverflow.com
youtube.com

After all visits, history should contain:

github.com
openai.com
oracle.com
stackoverflow.com
youtube.com
*/

import java.util.*;

class Assignment65_1XX
{

    public static void main(String A[])
    {
        String Arr[] = {"google.com","github.com","openai.com","oracle.com","stackoverflow.com","youtube.com"};
        
        Deque<String> history = new LinkedList<String>();

        for(String str : Arr)
        {
            history.addLast(str);

            if(history.size() > 5)
            {
                history.removeFirst();
            }
        }

        for(String str : history)
        {
            System.out.println(str);
        }

        
    }
}