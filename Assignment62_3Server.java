/*
Write a Java program that accepts the names of a source file and destination file 
and copies all data from the source into the destination.

Example

Enter source file:
Demo.txt

Enter destination file:
Backup.txt

File copied successfully

Requirements

Use 
FileInputStream
FileOutputStream

*/

import java.net.*;
import java.io.*;

class Assignment62_3Server
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
                String SourceFileName = dis.readUTF();
                System.out.println("Source File Name received from client is : "+SourceFileName);

                String DestinationFileName = dis.readUTF();
                System.out.println("Destination File Name received from client is : "+DestinationFileName);

                File Sourcefile = new File(SourceFileName);
                File Destfile = new File(DestinationFileName);

                if(Sourcefile.exists() && Sourcefile.isFile())
                {
                    FileInputStream fis = new FileInputStream(Sourcefile);
                    FileOutputStream fos = new FileOutputStream(Destfile);

                    byte buffer[] = new byte[1024];

                    int iRet = 0;

                    while((iRet = fis.read(buffer)) != -1)
                    {
                        fos.write(buffer,0,iRet);
                    }
                    
                    dos.writeUTF("File copied successfully");
                }
                else
                {
                    dos.writeUTF("Source FILE_NOT_EXISTS");
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