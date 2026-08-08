// Write a java program to accept file name from user and create new file of that name
// if it is not existing

import java.util.*;
import java.io.*;

class Assignment45_4
{
    public static void main(String A[])
    {
        String Fname = null;

        Scanner sobj = null;
        sobj =  new Scanner(System.in);

        File fobj = null;

        System.out.println("Enter name of file : ");
        Fname = sobj.nextLine();


        try
        {
            fobj = new File(Fname);

            if(fobj.exists())
            {
                System.out.println("File is already exists");

            }
            else
            {
                fobj.createNewFile();
                System.out.println("File gets created successfully");
            }

        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }



    }
}