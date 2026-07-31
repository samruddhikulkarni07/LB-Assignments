//Write application which accept file name from user and Open that file in Read mode

#include<stdio.h>
#include<fcntl.h>

void OpenFile(char *FName)
{
    int fd = 0;

    fd = open(FName, O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file\n");
        return;
    }
    else
    {
        printf("File gets opened successsfully\n");

        close(fd);
    }
}

int main()
{
    char FileName[30] = {'\0'};

    printf("Enter file name  : ");
    scanf("%[^'\n']s",FileName);

    OpenFile(FileName);

    return 0;
}