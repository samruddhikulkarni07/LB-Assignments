// Write a java program to accept file name from user and open that file 
// and display the contents on screen

import java.util.*;
import java.io.*;

class Assignment45_2
{
    public static void main(String A[])
    {
        int iRet = 0;
        String Fname = null;

        Scanner sobj = null;
        sobj =  new Scanner(System.in);

        File fobj = null;
        FileInputStream fiobj = null;

        System.out.println("Enter name of file : ");
        Fname = sobj.nextLine();

        byte Buffer[] = new byte[10];


        try
        {
            fobj = new File(Fname);
            fiobj = new FileInputStream(fobj);

            if(fobj.exists())
            {
                String str = null;

                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    str = new String(Buffer);
                    System.out.print(str);
                    str = null;
                }

            }

        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }



    }
}