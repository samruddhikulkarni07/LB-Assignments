//Write application which accept file name from user and create that file.

#include<stdio.h>
#include<fcntl.h>

void CreateFile(char *FName)
{
    int fd = 0;

    fd = creat(FName, 0600);

    if(fd == -1)
    {
        printf("Unable to create file\n");
        return;
    }
    else
    {
        printf("File gets created successsfully\n");
    }
}

int main()
{
    char FileName[30] = {'\0'};

    printf("Enter file name  : ");
    scanf("%[^'\n']s",FileName);

    CreateFile(FileName);

    return 0;
}