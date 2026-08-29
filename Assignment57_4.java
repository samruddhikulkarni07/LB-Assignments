// Write a program to count Vowels and consonants in a string

import java.util.*;

class StringX
{
    public void CountVowelsConsonants(String str)
    {
        int VowelsCount = 0;
        int ConsonantsCount = 0;

        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
               str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                VowelsCount++;

            }
            else if(Character.isLetter(str.charAt(i)))
            {
                ConsonantsCount++;
            }
            else
            {
                continue;
            }
        }

        System.out.println("Vowels count is : "+VowelsCount);
        System.out.println("Consonants count is : "+ConsonantsCount);
        
        
    }

}
class Assignment57_4
{
    public static void main(String A[])
    {
        String str = null;
    
        Scanner sobj = new Scanner(System.in);
        StringX strobj = new StringX();

        System.out.println("Enter string : ");
        str = sobj.nextLine();

        strobj.CountVowelsConsonants(str);

        
    }
}
