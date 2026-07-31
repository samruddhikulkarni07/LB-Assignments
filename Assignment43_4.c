// Write a program which accept file name and one character from user and count number of occurrences of that characters
//  from that file

#include<stdio.h> 
#include<fcntl.h>
#include<unistd.h>
#include<string.h>


#define BUFFER_SIZE 1024

int CountChar(char FName[], char ch)
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int iRet = 0, iCount = 0, i = 0, fd = 0;

    fd = open(FName, O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file");
        return -1;
    }

    while((iRet =read(fd,Buffer,sizeof(Buffer))) != 0)
    {
        for(i = 0; i < iRet; i++)
        {
            if(Buffer[i] == ch)
            {
                iCount++;
            }
        }

        memset(Buffer, '\0', sizeof(Buffer));
    }

    close(fd);

    return iCount;

}

int main()
{
    char FileName[30];
    int iRet = 0;
    char cValue = '\0';

    printf("Enter file name :");
    scanf("%[^'\n']s",FileName);

    printf("Enter the character :");
    scanf(" %c",&cValue);

    iRet = CountChar(FileName, cValue);

    printf("Frequency is  %d \n",iRet);

    return 0;

}