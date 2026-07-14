// Write a program which accept string from user and copy the contents of that 
// string into another string.(Implement strncpy() function).
// If the third parameter is greater than the size of source string then copy whole 
// string into destination.

#include<stdio.h>

void StrNCpyX(char *src, char *dest,int iCnt)
{
    // Filter
    if(src == NULL || dest == NULL)
    {
        return;
    }
    
    while((*src != '\0') && (iCnt != 0))
    {
        *dest = *src;
        src++;
        dest++;
        iCnt--;
    }

    *dest = '\0';

}

int main()
{
    char arr[30] = "Marvellous Multi OS";
    char brr[30];

    StrNCpyX(arr,brr,10);

    printf("%s",brr);

    return 0;
}