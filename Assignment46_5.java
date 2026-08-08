// Write a java program to accept directory name from user and display all 
// names of files from that directory and size of each file on screen

import java.util.*;
import java.io.*;

class Assignment46_5
{
    public static void main(String A[])
    {
        String DirName = null;

        Scanner sobj = null;
        sobj =  new Scanner(System.in);

        File fobj = null;

        System.out.println("Enter name of directory : ");
        DirName = sobj.nextLine();


        try
        {
            fobj = new File(DirName);

            if((fobj.exists()) && (fobj.isDirectory()))
            {
                System.out.println("Directory is present");
                File fArr[] = fobj.listFiles();

                for(int i = 0; i < fArr.length; i++)
                {
                    System.out.println("Name : "+fArr[i].getName());
                    System.out.println("Size : "+fArr[i].length());
                }


            }
        
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }



    }
}