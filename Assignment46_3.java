// Write java program to accept directory name from user and create
// that directory

import java.io.*;
import java.util.*;

class Assignment46_3
{
    public static void main(String A[])
    {
        String Dirname = null;

        Scanner sobj = new Scanner(System.in);

        File fobj = null;

        System.out.println("Enter directory name : ");
        Dirname = sobj.nextLine();

        fobj = new File(Dirname);

        if(fobj.mkdirs())
        {
            System.out.println("Directory gets created successfully");
        }
        else
        {
            System.out.println("Unable to create directory");
        }
    }
}