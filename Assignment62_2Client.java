import java.net.*;
import java.io.*;
import java.util.*;

class Assignment62_2Client
{
    public static void main(String A[])
    {
        try
        {
            System.out.println("-----------------------------------------------------------");
            System.out.println("--------------------CLIENT STARTED-------------------------");
            System.out.println("-----------------------------------------------------------");

           Socket socket = new Socket(
                                        "127.0.0.1",
                                        7000
           );

           System.out.println("Connection with server is completed successfully");

           DataInputStream dis = new DataInputStream(socket.getInputStream());
           DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

           System.out.println(dis.readUTF());

           String response = null;

           while(true)
           {
                Scanner sobj = new Scanner(System.in);

                System.out.println("Enter File Name : ");
                String FileName = sobj.nextLine();

                dos.writeUTF(FileName);

                String responce = dis.readUTF();

                if(responce.equals("FILE_EXISTS"))
                {
                    System.out.println("Data from file is :");

                    byte buffer[] = new byte[1024];

                    int iRet = 0;

                    while((iRet = dis.read(buffer)) != -1)
                    {
                        String str = new String(buffer, 0, iRet);
                        System.out.println(str);
                    }

                    System.out.println();

                }
                else
                {
                    System.out.println("There is no such file exists");
                }

                break;

           }

           socket.close();
           dis.close();
           dos.close();

        }
        catch(Exception eobj)
        {
            System.out.println("Exception occured :"+eobj);
        }
    }

}