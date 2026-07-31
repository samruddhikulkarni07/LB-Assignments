//Write application which accept file name from user and one string from user.
//Write that string at the end of file

#include<stdio.h>
#include<fcntl.h>
#include<String.h>

#define BUFFER_SIZE 1024

void AppendString(char *FName, char *data)
{

    int fd = 0;

    fd = open(FName, O_RDWR | O_APPEND);

    if(fd == -1)
    {
        printf("Unable to open file\n");
        return;
    }

    write(fd, data, strlen(data));

    printf("Data gets write successfully\n");

   
}

int main()
{
    char FileName[30] = {'\0'};
    char String[30] = {'\0'};
    int iRet = 0;

    printf("Enter file name  : ");
    scanf("%[^'\n']s",FileName);

    printf("Enter String : ");
    scanf(" %[^'\n']s",String);

    AppendString(FileName, String);

    return 0;
}