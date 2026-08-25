// Write a program to count frequency of each character
//input :  hello
//output : h -> 1
//         e -> 1 
//         l -> 2
//         o -> 1


import java.util.*;

class StringX
{
    public void CountFrequency(String str)
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
            if(Frequency[i] > 0)
            {
                char character = (char)(i+97);
                System.out.println(character+" -> "+Frequency[i]);

            }
        }
        
    
    }

}
class Assignment56_5
{
    public static void main(String A[])
    {
        String str = null;

        Scanner sobj = new Scanner(System.in);
        StringX strobj = new StringX();

        System.out.println("Enter string : ");
        str = sobj.nextLine();

        strobj.CountFrequency(str);

        
    }
}
