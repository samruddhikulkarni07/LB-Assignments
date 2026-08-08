// Write java program to accept file name from user and check whether that file
// is regular file or not

import java.io.*;
import java.util.*;

class Assignment46_2
{
    public static void main(String A[])
    {
        String Fname = null;

        Scanner sobj = new Scanner(System.in);

        File fobj = null;

        System.out.println("Enter file name : ");
        Fname = sobj.nextLine();

        fobj = new File(Fname);

        if(fobj.isFile())
        {
            System.out.println("It is a regular file");
        }
        else
        {
            System.out.println("It is not a regular file");
        }
    }
}