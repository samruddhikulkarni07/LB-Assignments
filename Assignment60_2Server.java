//Develop a client-server application where the server performs
//  different number-related operations requested by the client.
/*The client should send commands in the following format:

EVEN <number>
ODD <number>
PRIME <number>
PERFECT <number>
FACTORIAL <number>
REVERSE <number>
*/

import java.net.*;
import java.io.*;

class Assignment60_2Server
{
    public static int ClientCount = 0;

    public static void main(String A[])
    {
        try
        {
            ServerSocket serversocket = new ServerSocket(6000);

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

                int No = Integer.parseInt(parts[1]);

                if(operation.equals("EVEN"))
                {
                    if(No % 2 == 0)
                    {
                        dos.writeUTF(String.valueOf(No) + " is a Even Number");
                    }
                    else
                    {
                        dos.writeUTF(String.valueOf(No) + " is not a Even Number");
                    }
                }
                else if(operation.equals("ODD"))
                {
                    if(No % 2 != 0)
                    {
                        dos.writeUTF(String.valueOf(No) + " is a Odd Number");
                    }
                    else
                    {
                        dos.writeUTF(String.valueOf(No) + " is not a Odd Number");
                    }
                }
                else if(operation.equals("PRIME"))
                {
                    boolean bFlag = true;

                    for(int i = 2; i <= No / 2; i++)
                    {
                        if(No % i == 0)
                        {
                            bFlag = false;
                            break;
                        }

                    }

                    if(bFlag == true)
                    {
                        dos.writeUTF(String.valueOf(No) + " is a prime number");
                    }
                    else
                    {
                        dos.writeUTF(String.valueOf(No) + " is not a prime number");
                    }
                }
                else if(operation.equals("PERFECT"))
                {
                    int iSum = 0;

                    for(int i = 1; i <= No / 2; i++)
                    {
                        if(No % i == 0)
                        {
                            iSum = iSum + i;
                        }
                    }

                    if(No == iSum)
                    {
                        dos.writeUTF(String.valueOf(No) + " is a perfect number");
                    }
                    else
                    {
                        dos.writeUTF(String.valueOf(No) + " is not a perfect number");
                    }
                    
                }
                else if(operation.equals("FACTORIAL"))
                {
                    Double Factorial = 1.0;

                    for(int i = No; i >= 1; i--)
                    {
                        Factorial = Factorial * i;
                    }

                    dos.writeUTF("Factorial is : "+ String.valueOf(Factorial));
                }
                else if(operation.equals("REVERSE"))
                {
                    int Reverse = 0;
                    int iDigit = 0;

                    while(No != 0)
                    {
                        iDigit = No % 10;
                        Reverse = (Reverse * 10) + iDigit;
                        No = No / 10;
                    }

                    dos.writeUTF("Reverse number is : "+ String.valueOf(Reverse));

                }

            }

        }
        catch(Exception eobj)
        {
            System.out.println("Exception occured : "+eobj);
        }




    }
}