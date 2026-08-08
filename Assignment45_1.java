// Write a java program to accept file name from user and open that file

import java.util.*;
import java.io.*;

class Assignment45_1
{
    public static void main(String A[])
    {
        String Fname = null;

        Scanner sobj = null;
        sobj =  new Scanner(System.in);

        System.out.println("Enter name of file : ");
        Fname = sobj.nextLine();

        File fobj = null;

        try
        {
            fobj = new File(Fname);

            if(fobj.exists())
            {
                System.out.println("File opened successsfully");
            }
            else
            {
                System.out.println("File not present, so unable to open file");
            }

        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }



    }
}