// Write a program which accept file name and one count from user and read that number of characters
//  from starting position

#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>


#define BUFFER_SIZE 1024

void DisplayN(char FName[], int iSize)
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int iRet = 0, iCount = 0, i = 0, fd = 0;

    fd = open(FName, O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file");
        return;
    }

    while((iRet =read(fd,Buffer,sizeof(Buffer))) != 0)
    {
        write(1, Buffer, iSize);
        memset(Buffer, '\0', sizeof(Buffer));
    }

    close(fd);

}

int main()
{
    char FileName[30];
    int iValue = 0;

    printf("Enter file name :");
    scanf("%[^'\n']s",FileName);

    printf("Enter the number of characters :");
    scanf(" %d",&iValue);

    DisplayN(FileName, iValue);

    return 0;

}