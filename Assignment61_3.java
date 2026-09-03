// Write a java program to accept file name from user and creates a new file on the local machine.

import java.util.*;
import java.io.*;

class Assignment61_3
{
    public static void main(String A[]) throws IOException
    {
        String FileName = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of file : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

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
}