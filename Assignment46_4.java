// Write java program to accept file name from user and calculate
// checksum of that file

import java.io.*;
import java.util.*;
import java.security.MessageDigest;

class Assignment46_4
{
    public static void main(String A[])
    {
        int iRet = 0;
        String Fname = null;

        Scanner sobj = new Scanner(System.in);
        File fobj = null;
        FileInputStream fiobj = null;

        System.out.println("Enter file name : ");
        Fname = sobj.nextLine();

        byte Buffer[] = new byte[10];

        try
        {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            fobj = new File(Fname);
            fiobj = new FileInputStream(fobj);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                digest.update(Buffer,0,iRet);
            }
            fiobj.close();

            byte hashBytes[] = digest.digest();

            String checksum = "";
            for (byte b : hashBytes)
            {
                int value = b & 0xff;
                String hex = Integer.toHexString(value);

                if (hex.length() == 1)
                {
                    hex = "0" + hex;
                }
                checksum = checksum + hex;
            }

            System.out.println("Checksum : " + checksum);

        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }

        
    }
}