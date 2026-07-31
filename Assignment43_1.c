// Write a program which accept file name from user and count number of capital characters
//  from that file

#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>


#define BUFFER_SIZE 1024

int CountCapital(char FName[])
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
            if(Buffer[i] >= 'A' && Buffer[i] <= 'Z')
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

    printf("Enter file name :");
    scanf("%[^'\n']s",FileName);

    iRet = CountCapital(FileName);

    printf("Number of capital characters are %d \n",iRet);

    return 0;

}