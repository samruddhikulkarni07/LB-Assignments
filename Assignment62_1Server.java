/*
Write a Java program that accepts a filename and textual data from the
 user and stores that data inside the specified file.

Example

Enter file name:
Demo.txt

Enter data:
Marvellous Infosystems Pune

Data written successfully

Requirements

Use:

FileOutputStream
Do not use higher-level utility functions for writing the complete file.

*/

import java.net.*;
import java.io.*;

class Assignment62_1Server
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

                    long fileSize = dis.readLong();

                    FileOutputStream fos = new FileOutputStream(file);

                    byte buffer[] = new byte[1024];

                    long totalRead = 0;

                    int iRet = 0;

                    while(totalRead < fileSize && (iRet = dis.read(buffer, 0, (int)Math.min(buffer.length,fileSize - totalRead))) != -1)
                    {
                        fos.write(buffer,0,iRet);
                        totalRead = totalRead + iRet;
                    }

                    fos.flush();
                    fos.close();

                    dos.writeUTF("Data written in file successsfully");
                    
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