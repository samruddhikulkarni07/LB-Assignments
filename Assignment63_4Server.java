/*
4. Develop a client-server application where the client can check whether a particular file exists on the server machine.

The client should send:

EXISTS <filename>

Example

Client:
EXISTS Demo.txt

Server:
Demo.txt exists on server

If unavailable:

Client:
EXISTS Test.txt

Server:
Test.txt does not exist

Requirements

The file checking operation must be performed by the server, not the client.

*/

import java.net.*;
import java.io.*;

class Assignment63_4Server
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
                    responce = parts[1] + " Exists on server";
                }
                else
                {
                    responce = parts[1] + " does not exists on server";
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