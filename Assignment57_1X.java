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

        StringBuffer NewSb = new StringBuffer();

        for(int i = 0; i < tokens.length; i++)
        {
            sb = new StringBuffer(tokens[i]);

            NewSb.append(sb.reverse());
            NewSb.append(" ");
        }

        String NewStr = new String(NewSb);

        NewStr = NewStr.trim();

        System.out.println(NewStr);

    }

}
class Assignment57_1X
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
