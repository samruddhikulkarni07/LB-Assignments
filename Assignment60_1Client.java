import java.net.*;
import java.io.*;
import java.util.*;

class Assignment60_1Client
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
                                        5000
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
                System.out.println("ADD <No1> <No2>");
                System.out.println("SUB <No1> <No2>");
                System.out.println("MULT <No1> <No2>");
                System.out.println("DIV <No1> <No2>");
                System.out.println("MOD <No1> <No2>");
                System.out.println("MAX <No1> <No2>");
                System.out.println("MIN <No1> <No2>");
                System.out.println("QUIT");

                System.out.println("---------------------------------------------------");

                Scanner sobj = new Scanner(System.in);

                System.out.println("Enter command : ");
                String command = sobj.nextLine();

                String parts[] = command.split(" ");

                String operation = parts[0].toUpperCase();

                if(operation.equals("ADD"))
                {
                    if(parts.length != 3)
                    {
                        System.out.println("Please enter valid command");
                        System.out.println("Usage : ADD <No1> <No2>");
                        continue;
                    }

                    dos.writeUTF(command);
                    response = dis.readUTF();
                    System.out.println("Addition is : "+response);
                }
                else if(operation.equals("SUB"))
                {
                    if(parts.length != 3)
                    {
                        System.out.println("Please enter valid command");
                        System.out.println("Usage : SUB <No1> <No2>");
                        continue;
                    }

                    dos.writeUTF(command);
                    response = dis.readUTF();
                    System.out.println("Substraction is : "+response);
                }
                else if(operation.equals("MULT"))
                {
                    if(parts.length != 3)
                    {
                        System.out.println("Please enter valid command");
                        System.out.println("Usage : MULT <No1> <No2>");
                        continue;
                    }

                    dos.writeUTF(command);
                    response = dis.readUTF();
                    System.out.println("Multiplication is : "+response);
                }
                else if(operation.equals("DIV"))
                {
                    if(parts.length != 3)
                    {
                        System.out.println("Please enter valid command");
                        System.out.println("Usage : DIV <No1> <No2>");
                        continue;
                    }

                    dos.writeUTF(command);
                    response = dis.readUTF();
                    System.out.println("Division is : "+response);
                }
                else if(operation.equals("MOD"))
                {
                    if(parts.length != 3)
                    {
                        System.out.println("Please enter valid command");
                        System.out.println("Usage : MOD <No1> <No2>");
                        continue;
                    }

                    dos.writeUTF(command);
                    response = dis.readUTF();
                    System.out.println("Mod is : "+response);
                }
                else if(operation.equals("MAX"))
                {
                    if(parts.length != 3)
                    {
                        System.out.println("Please enter valid command");
                        System.out.println("Usage : MAX <No1> <No2>");
                        continue;
                    }

                    dos.writeUTF(command);
                    response = dis.readUTF();
                    System.out.println("Maximum is : "+response);
                }
                else if(operation.equals("MIN"))
                {
                    if(parts.length != 3)
                    {
                        System.out.println("Please enter valid command");
                        System.out.println("Usage : MIN <No1> <No2>");
                        continue;
                    }

                    dos.writeUTF(command);
                    response = dis.readUTF();
                    System.out.println("Minimum is : "+response);
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