// Write a program to remove duplicate characters from a string
//input : Banana
//output : Ban

import java.util.*;

class StringX
{
    public String RemoveDuplicateCharacters(String str)
    {
        str = str.trim();
        str = str.replaceAll("\\s+"," ");

        String updated = new String();

        for(int i = 0; i < str.length(); i++)
        {
            if(updated.indexOf(str.charAt(i)) == -1)
            {
                updated = updated + str.charAt(i);
            }
        
        }

        return updated;
        
    }

}
class Assignment57_3
{
    public static void main(String A[])
    {
        String str = null;
        String updated = null;

        Scanner sobj = new Scanner(System.in);
        StringX strobj = new StringX();

        System.out.println("Enter string : ");
        str = sobj.nextLine();

        updated = strobj.RemoveDuplicateCharacters(str);

        System.out.println("Updated string is : "+updated);

        
    }
}
