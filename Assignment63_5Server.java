/*
5. Develop a client-server application where the client can request information about a file stored on the server.

Command:

INFO <filename>

Example

Client:
INFO Demo.txt

Server:

File Name     : Demo.txt
Size          : 2450 bytes
Readable      : true
Writable      : true
Absolute Path : /ServerData/Demo.txt

Handle nonexistent files appropriately.

*/

import java.net.*;
import java.io.*;

class Assignment63_5Server
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
            
            dos.writeUTF("Connected to FTP server");

            while(true)
            {
                String Command = dis.readUTF();
                System.out.println("Command received from client is : "+Command);

                String parts[] = Command.split(" ");

                File file = new File(parts[1]);

                String responce = "";

                if(file.exists() && file.isFile())
                {
                    responce = responce + "File Name :" +file.getName() + "\n";
                    responce = responce + "Size : " +file.length() +" bytes\n";
                    responce = responce + "Readable : "+file.canRead() + "\n";
                    responce = responce + "Writable : "+file.canWrite() + "\n";
                    responce = responce + "Absolute path : "+file.getAbsolutePath() +"\n";

                }
                else
                {
                    responce = "their is no such file exists";
                }

                dos.writeUTF(responce);

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