/*
Write a Java application that accepts a filename and
displays detailed information about that file.

Expected output :
File Name       : Demo.txt
Absolute Path    : /Users/Marvellous/Demo.txt
File Size        : 2048 bytes
Readable         : true
Writable         : true
Hidden           : false
Last Modified    : ...

*/

import java.net.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

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
                String FileName = dis.readUTF();
                System.out.println("File Name received from client is : "+FileName);

                File file = new File(FileName);
                
                if(file.exists())
                {
                    String info = "";

                    info = info + "File Name : " +file.getName() + "\n";
                    info = info + "Absolute Path : " +file.getAbsolutePath() + "\n";
                    info = info + "File Size : " + file.length() + "bytes\n";
                    info = info + "Readable : "+file.canRead() + "\n";
                    info = info + "Writable : "+file.canWrite() + "\n";
                    info = info + "Hidden : "+file.isHidden() + "\n";

                    long lastModified = file.lastModified();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a");
                    info = info + "Last Modified : "+sdf.format(new Date(lastModified)) + "\n";

                    dos.writeUTF(info);

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