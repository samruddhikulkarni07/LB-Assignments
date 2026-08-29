// Write a program to reverse each word of a sentence.
//input : Java is Powerful
//output : avaJ si lufrewoP

import java.util.*;

class StringX
{
    public void ReverseWords(String str)
    {
        str = str.trim();
        str = str.replaceAll("\\s+"," ");

        String tokens[]  = str.split(" ");

        StringBuffer sb = null;

        for(int i = 0; i < tokens.length; i++)
        {
            sb = new StringBuffer(tokens[i]);

            System.out.print(sb.reverse());

            System.out.print(" ");
        }

    }

}
class Assignment57_1
{
    public static void main(String A[])
    {
        String str = null;

        Scanner sobj = new Scanner(System.in);
        StringX strobj = new StringX();

        System.out.println("Enter string : ");
        str = sobj.nextLine();

        strobj.ReverseWords(str);

        
    }
}
