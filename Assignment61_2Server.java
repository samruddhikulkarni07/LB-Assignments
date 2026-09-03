//Extend the existing client-server application by implementing commands 
// that provide information about the server.

/*Supported commands:
DATE
TIME
SERVERNAME
HELP
QUIT
*/

import java.net.*;
import java.io.*;
import java.time.LocalTime;
import java.time.LocalDate;

class Assignment61_2Server
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

                String operation = command.toUpperCase();

                if(operation.equals("DATE"))
                {
                    LocalDate date = LocalDate.now();
                    dos.writeUTF(date.toString());
                }
                else if(operation.equals("TIME"))
                {
                    LocalTime time = LocalTime.now();
                    dos.writeUTF(time.toString());
                }
                else if(operation.equals("SERVERNAME"))
                {
                    String servername = InetAddress.getLocalHost().getHostName();
                    dos.writeUTF(servername);

                }
                else if(operation.equals("HELP"))
                {
                    dos.writeUTF("Available commands :\n DATE \n TIME \n SERVERNAME \n HELP \n QUIT \n");
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