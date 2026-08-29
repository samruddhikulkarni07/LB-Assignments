// Write a program to check whether one string is rotation of another
// String B is the rotation of string A if it can be obtained by shifting character

import java.util.*;

class StringX
{
    public boolean CheckRotation(String str1, String str2)
    {
        boolean bFlag = true;

        if(str1.length() != str2.length())
        {
            return false;

        }

        str1 = str1.trim();
        str1 = str1.replaceAll("\\s+"," ");
        str1 = str1.toLowerCase();
        char Arr[] = str1.toCharArray();
        Arrays.sort(Arr);

        str2 = str2.trim();
        str2 = str2.replaceAll("\\s+"," ");
        str2 = str2.toLowerCase();
        char Brr[] = str2.toCharArray();
        Arrays.sort(Brr);

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] != Brr[i])
            {
                bFlag = false;
            }
        }
        
        return bFlag;
    }

}
class Assignment57_5
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

        bRet = strobj.CheckRotation(str1, str2);

        if(bRet == true)
        {
            System.out.println("Rotation");
        }
        else
        {
            System.out.println("Not Rotation");
        }
        
    }
}
