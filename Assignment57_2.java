// Write a program to find longest word in a sentence
//input : Marvellous Infosystems pune
//output : Infosystems

import java.util.*;

class StringX
{
    public String LongestWord(String str)
    {
        str = str.trim();
        str = str.replaceAll("\\s+"," ");

        String tokens[]  = str.split(" ");

        String longestword = tokens[0];

        for(int i = 0; i < tokens.length; i++)
        {
            if(tokens[i].length() > longestword.length())
            {
                longestword = tokens[i];
            }
        }

        return longestword;

    }

}
class Assignment57_2
{
    public static void main(String A[])
    {
        String str = null;
        String longest= null;

        Scanner sobj = new Scanner(System.in);
        StringX strobj = new StringX();

        System.out.println("Enter string : ");
        str = sobj.nextLine();

        longest = strobj.LongestWord(str);

        System.out.println("Longest word from the string is : "+longest);

        
    }
}
