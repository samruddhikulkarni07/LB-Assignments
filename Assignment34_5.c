// Write a program which accept 2 string from user and concat second string after
// first string.(Implement strcat() function).

#include<stdio.h>

void StrCatX(char *src, char *dest)
{
    // Filter
    if(src == NULL || dest == NULL)
    {
        return;
    }
    
    while(*src != '\0')
    {
        src++;
    }

    *src = ' ';
    src++;

    while(*dest != '\0')
    {
        *src = *dest;
        dest++;
        src++;
    }

    *src = '\0';

}

int main()
{
    char arr[50] = "Marvellous Infosystems";
    char brr[30] = "Logic Building";

    StrCatX(arr,brr);

    printf("%s",arr);

    return 0;
}