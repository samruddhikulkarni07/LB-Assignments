// Write a program to print duplicate characters from a string.
//input :  programming
//output : r g m


import java.util.*;

class StringX
{
    public void DisplayDuplicateCharacters(String str)
    {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        str = str.toLowerCase();

        char Arr[] = str.toCharArray();

        int Frequency[] = new int[26];

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Frequency[(int)Arr[i] - 97]++;
            }
        }

        for(int i = 0; i < Frequency.length; i++)
        {
            if(Frequency[i] > 1)
            {
                char character = (char)(i+97);
                System.out.print(character+"\t");

            }
        }
        
    
    }

}
class Assignment56_4
{
    public static void main(String A[])
    {
        String str = null;

        Scanner sobj = new Scanner(System.in);
        StringX strobj = new StringX();

        System.out.println("Enter string : ");
        str = sobj.nextLine();

        strobj.DisplayDuplicateCharacters(str);

        
    }
}
