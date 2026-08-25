// Write a program to check whether a given string is a palindrome.
//A string is called a palindrome if it reads the same forward and backward.
//ex. madam

import java.util.*;

class StringX
{
    public boolean CheckPalindrome(String str)
    {
        String rev = null;

        str = str.trim();
        str = str.replaceAll("\\s+"," ");

        str = str.toLowerCase();


        StringBuffer sb = null;

        sb = new StringBuffer(str);

        sb = sb.reverse();

        rev = new String(sb);

        if(str.equals(rev))
        {
            return true;
        }
        else
        {
            return false;
        }

    
    }

}
class Assignment56_1
{
    public static void main(String A[])
    {
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        StringX strobj = new StringX();

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        bRet = strobj.CheckPalindrome(str);

        if(bRet == true)
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }



    }
}
