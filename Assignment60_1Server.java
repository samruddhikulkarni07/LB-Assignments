//Develop a multithreaded client-server application in Java that performs
//mathematical operations remotely.
//The client should accept a command from the user and send that command to the server.
//The server should parse the received command, perform the requested mathematical 
// operation, and return the result to the client.
/*The server should support the following commands:

ADD <No1> <No2>
SUB <No1> <No2>
MULT <No1> <No2>
DIV <No1> <No2>
MOD <No1> <No2>
MAX <No1> <No2>
MIN <No1> <No2>
QUIT
*/

import java.net.*;
import java.io.*;

class Assignment60_1Server
{
    public static int ClientCount = 0;

    public static void main(String A[])
    {
        try
        {
            ServerSocket serversocket = new ServerSocket(5000);

            System.out.println("---------------------------------------------------");
            System.out.println("--------------------SERVER STARTED-----------------");
            System.out.println("---------------------------------------------------");

            while(true)
            {

                System.out.println("Server is waiting for client Request");

                Socket clientSocket = serversocket.accept();

                System.out.println("Client gets connected successfully");

                Thread t = new Thread(() -> HandleClientRequest(clientSocket));

                t.start();

            }

        }
        catch(Exception eobj)
        {
            System.out.println("Exception occured : "+eobj);
        }
    }

    public static void HandleClientRequest(Socket socket)
    {
        ClientCount++;
        System.out.println("New thread gets created for client no : "+ClientCount);

        try
        {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeUTF("Connected to Mathematical server");

            double result = 0.0;

            while(true)
            {
                String command = dis.readUTF();
                System.out.println("Command received from client is : "+command);

                String parts[] = command.split(" ");
                String operation = parts[0].toUpperCase();

                if(operation.equals("QUIT"))
                {
                    ClientCount--;
                    dos.writeUTF("Client gets disconnected from server");
                    break;
                }

                double No1 = Double.parseDouble(parts[1]);
                double No2 = Double.parseDouble(parts[2]);

                if(operation.equals("ADD"))
                {
                    result = No1 + No2;
                    dos.writeUTF(String.valueOf(result));
                }
                else if(operation.equals("SUB"))
                {
                    result = No1 - No2;
                    dos.writeUTF(String.valueOf(result));
                }
                else if(operation.equals("MULT"))
                {
                    result = No1 * No2;
                    dos.writeUTF(String.valueOf(result));
                }
                else if(operation.equals("DIV"))
                {
                    if(No2 == 0)
                    {
                        result = 0.0;
                        dos.writeUTF("Division by zero not posible because it returns infinity");
                    }
                    else
                    {
                        result = No1 / No2;
                        dos.writeUTF(String.valueOf(result));
                    }
                    
                }
                else if(operation.equals("MOD"))
                {
                    if(No2 == 0)
                    {
                        result = 0.0;
                        dos.writeUTF("Division by zero not posible because it returns infinity");
                    }
                    else
                    {
                        result = No1 % No2;
                        dos.writeUTF(String.valueOf(result));
                    }
                }
                else if(operation.equals("MAX"))
                {
                    if(No1 > No2)
                    {
                        dos.writeUTF(String.valueOf(No1));
                    }
                    else
                    {
                        dos.writeUTF(String.valueOf(No2));
                    }
                }
                else if(operation.equals("MIN"))
                {
                    if(No1 < No2)
                    {
                        dos.writeUTF(String.valueOf(No1));
                    }
                    else
                    {
                        dos.writeUTF(String.valueOf(No2));
                    }
                }
                


            }

        }
        catch(Exception eobj)
        {
            System.out.println("Exception occured : "+eobj);
        }




    }
}