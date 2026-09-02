import java.net.*;
import java.io.*;
import java.util.*;

class Assignment60_2Client
{

    public static void main(String A[])
    {
        try
        {
            System.out.println("---------------------------------------------------");
            System.out.println("--------------------CLIENT STARTED-----------------");
            System.out.println("---------------------------------------------------");

            Socket socket = new Socket(
                                        "127.0.0.1",
                                        6000
            );

            System.out.println("Connection with server is done successfully");

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            System.out.println(dis.readUTF());

            String response = null;

            while(true)
            {
                System.out.println("---------------------------------------------------");

                System.out.println("--------------Mathematical commands----------------");
                System.out.println("EVEN <number>");
                System.out.println("ODD <number>");
                System.out.println("PRIME <number>");
                System.out.println("PERFECT <number>");
                System.out.println("FACTORIAL <number>");
                System.out.println("REVERSE <number>");
                System.out.println("QUIT");

                System.out.println("---------------------------------------------------");

                Scanner sobj = new Scanner(System.in);

                System.out.println("Enter command : ");
                String command = sobj.nextLine();

                String parts[] = command.split(" ");

                String operation = parts[0].toUpperCase();

                if(operation.equals("EVEN"))
                {
                    if(parts.length != 2)
                    {
                        System.out.println("Please enter valid command");
                        System.out.println("Usage : EVEN <number>");
                        continue;
                    }

                    dos.writeUTF(command);
                    response = dis.readUTF();
                    System.out.println(response);
                }
                else if(operation.equals("ODD"))
                {
                    if(parts.length != 2)
                    {
                        System.out.println("Please enter valid command");
                        System.out.println("Usage : ODD <number>");
                        continue;
                    }

                    dos.writeUTF(command);
                    response = dis.readUTF();
                    System.out.println(response);
                }
                else if(operation.equals("PRIME"))
                {
                    if(parts.length != 2)
                    {
                        System.out.println("Please enter valid command");
                        System.out.println("Usage : PRIME <number>");
                        continue;
                    }

                    dos.writeUTF(command);
                    response = dis.readUTF();
                    System.out.println(response);
                }
                else if(operation.equals("PERFECT"))
                {
                    if(parts.length != 2)
                    {
                        System.out.println("Please enter valid command");
                        System.out.println("Usage : PERFECT <number>");
                        continue;
                    }

                    dos.writeUTF(command);
                    response = dis.readUTF();
                    System.out.println(response);
                }
                else if(operation.equals("FACTORIAL"))
                {
                    if(parts.length != 2)
                    {
                        System.out.println("Please enter valid command");
                        System.out.println("Usage : FACTORIAL <number>");
                        continue;
                    }

                    dos.writeUTF(command);
                    response = dis.readUTF();
                    System.out.println(response);
                }
                else if(operation.equals("REVERSE"))
                {
                    if(parts.length != 2)
                    {
                        System.out.println("Please enter valid command");
                        System.out.println("Usage : REVERSE <number>");
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
                    System.out.println("Thank you for using Our Mathematical server");
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
            System.out.println("Exception occured : "+eobj);
        }
    }

}