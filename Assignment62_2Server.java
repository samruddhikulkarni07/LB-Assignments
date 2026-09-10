/*
Write a Java program that accepts a filename and display the complete content of the file.

Example

Assume Demo.txt contains:

Marvellous Infosystems
Logic Building Batch
Pune

Output:

Enter file name:
Demo.txt

File contents:

Marvellous Infosystems
Logic Building Batch
Pune

Requirements

Use FileInputStream.

Display an appropriate error message if the specified file does not exist.
*/

import java.net.*;
import java.io.*;

class Assignment62_2Server
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
                String FileName = dis.readUTF();

                System.out.println("FileName received from client is : "+FileName);

                File file = new File(FileName);

                if(file.exists() && file.isFile())
                {
                    dos.writeUTF("FILE_EXISTS");

                    FileInputStream fis = new FileInputStream(file);

                    byte buffer[] = new byte[1024];

                    int iRet = 0;

                    while((iRet = fis.read(buffer)) != -1)
                    {
                        dos.write(buffer,0,iRet);
                    }
                    
                }
                else
                {
                    dos.writeUTF("FILE_NOT_EXISTS");
                }

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