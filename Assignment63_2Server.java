/*
Write a Java application that accepts the path of a directory and a file name from user .
search for the specified file inside directory.

*/

import java.net.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

class Assignment63_2Server
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
                String path = dis.readUTF();
                System.out.println("Directory path received from client is : "+path);

                String fileName = dis.readUTF();
                System.out.println("File Name received from client to search in directory is : "+fileName);

                File folder = new File(path);
                
                if(folder.exists() && folder.isDirectory())
                {
                    File files[] = folder.listFiles();

                    boolean bFlag = false;

                    if(files != null)
                    {
                        for(File f : files)
                        {
                            if(f.isFile() && (f.getName()).equals(fileName))
                            {
                                bFlag = true;
                                break;
                            }
                            
                        }
                    }

                    if(bFlag == true)
                    {
                        dos.writeUTF("File found");
                    }
                    else
                    {
                        dos.writeUTF("File not found");
                    }

                }
                else
                {
                    dos.writeUTF("Directory_NOT_EXISTS");
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