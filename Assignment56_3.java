// Write a program to check whether a given string is a Pangram.
//Two string is a Pangram if it contain all alphabets from 'a' to 'z' at least once.
// Ex : the quick brown fox jumps over the lazy dog

import java.util.*;

class StringX
{
    public boolean CheckPangram(String str)
    {
        int i = 0;
        boolean bFlag = true;

        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        str = str.toLowerCase();

        char Arr[] = str.toCharArray();

        int Frequency[] = new int[26];

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Frequency[(int)Arr[i] - 97]++;
            }
        }

        for(i = 0; i < Frequency.length; i++)
        {
            if(Frequency[i] == 0)
            {
                bFlag = false;
                break;
            }
        }
        
        return bFlag;
    
    }

}
class Assignment56_3
{
    public static void main(String A[])
    {
        String str = null;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        StringX strobj = new StringX();

        System.out.println("Enter string : ");
        str = sobj.nextLine();

        bRet = strobj.CheckPangram(str);

        if(bRet == true)
        {
            System.out.println("String is Pangram");
        }
        else
        {
            System.out.println("Strings is not Pangram");
        }



    }
}
