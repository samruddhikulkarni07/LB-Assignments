/*
Write a Java application that accepts the name of a text file 
and performs analysis on its contents.

Calculate:
- Total characters
- Total words
- Total lines
- Uppercase characters
- Lowercase characters
- Digits
- Spaces

Example

File : Demo.txt

Characters : 250
Words      : 45
Lines      : 10
Uppercase  : 15
Lowercase  : 180
Digits     : 10
Spaces     : 35

*/

import java.net.*;
import java.io.*;

class Assignment63_3Server
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

                if(file.exists() && file.isFile())
                {
                    FileInputStream fis = new FileInputStream(file);

                    byte buffer[] = new byte[1024];
                    int iRet = 0;

                    int charCount = 0;
                    int wordsCount = 0;
                    int lineCount = 0;
                    int upperCount = 0;
                    int lowerCount = 0;
                    int digitCount = 0;
                    int spacesCount = 0;

                    boolean insideWord = false;

                    while((iRet = fis.read(buffer)) != -1)
                    {

                        for(int i = 0; i < iRet; i++)
                        {
                            charCount++;

                            char ch = (char)buffer[i];

                            if(ch == '\n')
                            {
                                lineCount++;
                            }

                            if(ch >= 'A' && ch <= 'Z')
                            {
                                upperCount++;
                            }

                            if(ch >= 'a' && ch <= 'z')
                            {
                                lowerCount++;
                            }

                            if(ch >= '0' && ch <= '9')
                            {
                                digitCount++;
                            }

                            if(Character.isWhitespace(ch))
                            {
                                spacesCount++;
                                insideWord = false;
                            }
                            else
                            {
                                if(insideWord == false)
                                {
                                    wordsCount++;
                                    insideWord = true;
                                }
                            }

                            
                        }
                    }

                    String info = "";

                    info = info + "Characters : " +charCount+"\n";
                    info = info + "Words : " +wordsCount+"\n";
                    info = info + "Lines : " +lineCount+"\n";
                    info = info + "UpperCase : " +upperCount+"\n";
                    info = info + "LowerCase : " +lowerCount+"\n";
                    info = info + "Digits : " +digitCount+"\n";
                    info = info + "Spaces : " +spacesCount+"\n";

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