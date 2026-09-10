import java.net.*;
import java.io.*;
import java.util.*;

class Assignment62_1Client
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
                    System.out.println("Enter data to write into file : ");
                    String Data = sobj.nextLine();

                    byte dataBytes[] = Data.getBytes();

                    dos.writeLong(dataBytes.length);
                    dos.write(dataBytes);
                    dos.flush();

                    System.out.println(dis.readUTF());

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