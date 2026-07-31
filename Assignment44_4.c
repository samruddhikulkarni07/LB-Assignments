//Write application which accept file name from user and display size of file.

#include<stdio.h>
#include<fcntl.h>
#include<String.h>
#include<sys/stat.h>

#define BUFFER_SIZE 1024

int Size(char *FName)
{
    struct stat sobj;

    stat(FName, &sobj);

    return sobj.st_size;
}

int main()
{
    char FileName[30] = {'\0'};
    int iRet = 0;

    printf("Enter file name  : ");
    scanf("%[^'\n']s",FileName);

    iRet = Size(FileName);

    printf("Size of file is %d bytes",iRet);

    return 0;
}