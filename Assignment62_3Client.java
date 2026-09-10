import java.net.*;
import java.io.*;
import java.util.*;

class Assignment62_3Client
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

                System.out.println("Enter Source File Name : ");
                String SourceFileName = sobj.nextLine();

                dos.writeUTF(SourceFileName);

                System.out.println("Enter destination File Name : ");
                String DestinationFileName = sobj.nextLine();

                dos.writeUTF(DestinationFileName);

                String responce = dis.readUTF();

                System.out.println(responce);

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