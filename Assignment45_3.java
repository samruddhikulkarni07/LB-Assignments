// Write a java program to accept file name from user and open that file in write mode 
// and write some data at the end of file

import java.util.*;
import java.io.*;

class Assignment45_3
{
    public static void main(String A[])
    {
        String Fname = null;

        Scanner sobj = null;
        sobj =  new Scanner(System.in);

        File fobj = null;
        FileOutputStream foobj = null;

        System.out.println("Enter name of file : ");
        Fname = sobj.nextLine();

        String str = " Kothrud, pune";
        byte data[] = str.getBytes(); 


        try
        {
            fobj = new File(Fname);
            foobj = new FileOutputStream(fobj, true);

            if(fobj.exists())
            {
                foobj.write(data);
                foobj.close();

            }

        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }



    }
}