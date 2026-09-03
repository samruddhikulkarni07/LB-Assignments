import java.net.*;
import java.io.*;
import java.util.*;

class Assignment61_2Client
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
                System.out.println("-----------------------------------------------------------");

                System.out.println("----------------------Supported Commands-------------------");
                System.out.println("DATE");
                System.out.println("TIME");
                System.out.println("SERVERNAME");
                System.out.println("HELP");
                System.out.println("QUIT");

                System.out.println("-----------------------------------------------------------");

                Scanner sobj = new Scanner(System.in);

                System.out.println("Enter Command : ");
                String command = sobj.nextLine();

                String parts[] = command.split(" ");

                String operation = parts[0].toUpperCase();

                if(operation.equals("DATE"))
                {
                    if(parts.length != 1)
                    {
                        System.out.println("Please enter valid command");
                        System.out.println("Usage : DATE");
                        continue;
                    }

                    dos.writeUTF(command);
                    response = dis.readUTF();
                    System.out.println(response);
                }
                else if(operation.equals("TIME"))
                {
                    if(parts.length != 1)
                    {
                        System.out.println("Please enter valid command");
                        System.out.println("Usage : TIME");
                        continue;
                    }

                    dos.writeUTF(command);
                    response = dis.readUTF();
                    System.out.println(response);
                }
                else if(operation.equals("SERVERNAME"))
                {
                    if(parts.length != 1)
                    {
                        System.out.println("Please enter valid command");
                        System.out.println("Usage : SERVERNAME");
                        continue;
                    }

                    dos.writeUTF(command);
                    response = dis.readUTF();
                    System.out.println(response);
                }
                else if(operation.equals("HELP"))
                {
                    if(parts.length != 1)
                    {
                        System.out.println("Please enter valid command");
                        System.out.println("Usage : HELP");
                        continue;
                    }

                    dos.writeUTF(command);
                    response = dis.readUTF();
                    System.out.println(response);
                }
                else if(operation.equals("QUIT"))
                {
                    if(parts.length != 1)
                    {
                        System.out.println("Please enter valid command");
                        System.out.println("Usage : QUIT");
                        continue;
                    }

                    dos.writeUTF(command);
                    System.out.println("Thank you for using string server");
                    response = dis.readUTF();
                    System.out.println(response);
                    break;
                }
                else
                {
                    System.out.println("Invalid command");
                    continue;
                }

           }

        }
        catch(Exception eobj)
        {
            System.out.println("Exception occured :"+eobj);
        }
    }

}