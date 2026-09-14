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

class Assignment65_1
{

    public static void main(String A[])
    {
        String Arr[] = {"google.com","github.com","openai.com","oracle.com","stackoverflow.com","youtube.com"};
        
        ArrayList<String> aobj = new ArrayList<String>();

        int i = 0;
        int startindex = 0;

        if(Arr.length <= 5)
        {
            for(i = 0; i < Arr.length; i++)
            {
                aobj.add(Arr[i]);
            }

        }
        else
        {
            startindex = Arr.length - 5;

            for(i = startindex; i < Arr.length; i++)
            {
                aobj.add(Arr[i]);
            }

        }

        for(String str : aobj)
        {
            System.out.println(str);
        }

        
    }
}