import java.net.*;
import java.io.*;
import java.util.*;

class Assignment63_4Client
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

                // EXISTS <filename>

                System.out.println("Enter command to check whether particular file is exist on the server machine : ");
                String Command = sobj.nextLine();

                String parts[] = Command.split(" ");

                String opeartion = parts[0].toUpperCase();

                if(opeartion.equals("EXISTS"))
                {
                    if(parts.length != 2)
                    {
                        System.out.println("Please enter valid command");
                        System.out.println("Usage : EXISTS <filename>");
                        continue;
                    }

                    dos.writeUTF(Command);
                    response = dis.readUTF();
                    System.out.println(response);
                    break;

                }
                else
                {
                    System.out.println("Please enter valid command");
                    continue;
                }
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