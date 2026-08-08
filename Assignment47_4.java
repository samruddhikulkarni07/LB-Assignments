// Write a java program to accept directory name from user and write data of all files along 
// with its name into one newly created file named as "Marvellous.txt" 

import java.io.*;
import java.util.*;

class Assignment47_4
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FolderName = null;
        String PackFileName = "Marvellous.txt";

        int iRet = 0;

        FileOutputStream foobj = null;
        FileInputStream fiobj = null;

        System.out.println("Enter folder name : ");
        FolderName = sobj.nextLine();

        File fobjfolder = new File(FolderName);

        byte Buffer[] = new byte[10];

        if((fobjfolder.exists()) && (fobjfolder.isDirectory()))
        {
            File fobjpack = new File(PackFileName);
            fobjpack.createNewFile();                   // pack file gets createdc

            foobj = new FileOutputStream(fobjpack);


            File fArr[] = fobjfolder .listFiles();

            for(int i = 0; i < fArr.length; i++)
            {
                fiobj = new FileInputStream(fArr[i]);

                // Write file name

                String name = fArr[i].getName() + "\n";
                foobj.write(name.getBytes());

                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    foobj.write(Buffer, 0, iRet);

                }

                foobj.write(("\n").getBytes());

                fiobj.close();
    
            }
            foobj.close();
        }
        else
        {
            System.out.println("There is no such folder");
        }
    }
}