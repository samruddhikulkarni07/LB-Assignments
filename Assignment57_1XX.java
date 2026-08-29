// Write a program to reverse each word of a sentence.
//input : Java is Powerful
//output : avaJ si lufrewoP

import java.util.*;

class StringX
{
    public String ReverseWords(String str)
    {
        str = str.trim();
        str = str.replaceAll("\\s+"," ");

        String tokens[]  = str.split(" ");

        StringBuffer sb = null;

        StringBuffer NewSb = new StringBuffer();

        for(int i = 0; i < tokens.length; i++)
        {
            sb = new StringBuffer(tokens[i]);

            NewSb.append(sb.reverse());
            NewSb.append(" ");
        }

        String NewStr = new String(NewSb);

        NewStr = NewStr.trim();

        return NewStr;

    }

}
class Assignment57_1XX
{
    public static void main(String A[])
    {
        String str = null;
        String reverse = null;

        Scanner sobj = new Scanner(System.in);
        StringX strobj = new StringX();

        System.out.println("Enter string : ");
        str = sobj.nextLine();

        reverse = strobj.ReverseWords(str);

        System.out.println(reverse);

        
    }
}
