//Develop a client-server application that performs different string operations.
//The client should send a command containing an operation and a string.

/*Supported commands:
LENGTH <string>
UPPER <string>
LOWER <string>
REVERSE <string>
PALINDROME <string>
VOWELS <string>
*/

import java.net.*;
import java.io.*;

class Assignment61_1Server
{
    public static int ClientCount = 0;

    public static void main(String A[])
    {
        try
        {
            ServerSocket serversocket = new ServerSocket(7000);

            System.out.println("-----------------------------------------------------------");
            System.out.println("--------------------SERVER STARTED-------------------------");
            System.out.println("-----------------------------------------------------------");

            while(true)
            {
                System.out.println("Server is waiting for client");

                Socket clientsocket = serversocket.accept();

                System.out.println("Client gets connected successfully");

                Thread t = new Thread(() -> HandleClientRequest(clientsocket));

                t.start();

            }

        }
        catch(Exception eobj)
        {
            System.out.println("Exception occured :"+eobj);
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
            
            dos.writeUTF("Connected to string server");

            while(true)
            {
                String command = dis.readUTF();

                System.out.println("Command received from client is : "+command);

                String parts[] = command.split(" ");
                String operation = parts[0].toUpperCase();

                if(operation.equals("LENGTH"))
                {
                    dos.writeUTF("Length of string is : "+ String.valueOf(parts[1].length()));
                }
                else if(operation.equals("UPPER"))
                {
                    dos.writeUTF(parts[1].toUpperCase());
                }
                else if(operation.equals("LOWER"))
                {
                    dos.writeUTF(parts[1].toLowerCase());
                }
                else if(operation.equals("REVERSE"))
                {
                    StringBuffer sb = new StringBuffer(parts[1]);
                    sb.reverse();

                    String reverse = new String(sb);

                    dos.writeUTF(reverse);

                }
                else if(operation.equals("PALINDROME"))
                {
                    StringBuffer sb = new StringBuffer(parts[1]);
                    sb.reverse();

                    String reverse = new String(sb);

                    if(reverse.equals(parts[1]))
                    {
                        dos.writeUTF("It is palindrome string");
                    }
                    else
                    {
                        dos.writeUTF("It is not palindrome string");
                    }

                }
                else if(operation.equals("VOWELS"))
                {
                    int iCount = 0;

                    for(char ch : parts[1].toCharArray())
                    {
                        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                           ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                        {
                            iCount++;
                        }
                    }

                    dos.writeUTF("Number of vowels are : "+String.valueOf(iCount));
                }
                else if(operation.equals("QUIT"))
                {
                    ClientCount--;
                    dos.writeUTF("Client gets disconnected from server");
                    break;
                }

                
            }

        }
        catch(Exception eobj)
        {
            System.out.println("Exception occured :"+eobj);
        }



    }
}