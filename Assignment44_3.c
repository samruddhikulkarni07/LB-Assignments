//Write application which accept file name from user and read all data from that file and display contents on screen.

#include<stdio.h>
#include<fcntl.h>
#include<String.h>

#define BUFFER_SIZE 1024

void DisplayContents(char *FName)
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int fd = 0, iRet = 0;

    fd = open(FName,O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file\n");
        return;
    }
    
    while((iRet = read(fd,Buffer,sizeof(Buffer))) != 0)
    {
        write(1,Buffer,iRet);
        memset(Buffer, '\0', sizeof(Buffer));
    }

    close(fd);
}

int main()
{
    char FileName[30] = {'\0'};

    printf("Enter file name  : ");
    scanf("%[^'\n']s",FileName);

    DisplayContents(FileName);

    return 0;
}