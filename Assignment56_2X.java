// Write a program to check whether a given string is a Anagram.
//Two strings are anagram if they contain same character with same frequency , regardless of order
// Ex : listen & silent

import java.util.*;

class StringX
{
    public boolean CheckAnagram(String str1, String str2)
    {
        boolean bFlag = true;

        if(str1.length() != str2.length())
        {
            return false;
        }

        str1 = str1.trim();
        str1 = str1.replaceAll("\\s+", " ");
        str1 = str1.toLowerCase();
        char Arr[] = str1.toCharArray();
        int Frequency1[] = new int[26];

        str2 = str2.trim();
        str2 = str2.replaceAll("\\s+", " ");
        str2 = str2.toLowerCase();
        char Brr[] = str2.toCharArray();
        int Frequency2[] = new int[26];

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Frequency1[(int)Arr[i] - 97]++;
            }
            if(Brr[i] >= 'a' && Brr[i] <= 'z')
            {
                Frequency2[(int)Brr[i] - 97]++;
            }
        }

        for(int i = 0; i < Frequency1.length; i++)
        {
            if(Frequency1[i] != Frequency2[i])
            {
                bFlag = false;
                break;
            }
        }

        return bFlag;

    
    }

}
class Assignment56_2X
{
    public static void main(String A[])
    {
        String str1 = null;
        String str2 = null;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        StringX strobj = new StringX();

        System.out.println("Enter first string : ");
        str1 = sobj.nextLine();

        System.out.println("Enter second string : ");
        str2 = sobj.nextLine();

        bRet = strobj.CheckAnagram(str1, str2);

        if(bRet == true)
        {
            System.out.println("Strings are Anagram ");
        }
        else
        {
            System.out.println("Strings are not Anagram");
        }



    }
}
