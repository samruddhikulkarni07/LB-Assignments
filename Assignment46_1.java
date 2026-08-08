// Write java program to accept two file names from user and open first file and create 
// new file(Second name) and copy the data from first file into newly created file

import java.io.*;
import java.util.*;

class Assignment46_1
{
    public static void main(String A[])
    {
        int iRet = 0;
        String SrcFile = null;
        String DestFile = null;

        Scanner sobj = new Scanner(System.in);
        File fobjsrc = null;
        File fobjdest = null;
        FileInputStream fiobj = null;
        FileOutputStream foobj = null;

        System.out.println("Enter name of source file : ");
        SrcFile = sobj.nextLine();

        System.out.println("Enter name of destination file : ");
        DestFile = sobj.nextLine();

        byte Buffer[] = new byte[10];

        try
        {
            fobjdest = new File(DestFile);
            fobjdest.createNewFile();

            fobjsrc = new File(SrcFile);

            fiobj = new FileInputStream(fobjsrc);
            foobj = new FileOutputStream(fobjdest);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer, 0, iRet);
            }

            fiobj.close();
            foobj.close();



        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }




    }
}