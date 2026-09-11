import java.net.*;
import java.io.*;
import java.util.*;

class Assignment63_3Client
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

                System.out.println("Enter name of text file to perform analysis on its contents : ");
                String fileName = sobj.nextLine();

                dos.writeUTF(fileName);

                String responce = dis.readUTF();

                if(responce.equals("FILE_NOT_EXISTS"))
                {
                    System.out.println("Their is no such file exists");
                }
                else
                {
                    System.out.println(responce);
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