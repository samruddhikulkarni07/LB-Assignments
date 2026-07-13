//Write a program which accept string from user and display it in reverse order

#include<stdio.h>

void Reverse(char *str)
{
    char *start = NULL;
    char *end = NULL;
    char temp = '\0';

    start = str;
    
    while(*str != '\0')
    {
        str++;
    }
    str--;

    end = str;

    while(start <= end)
    {
        temp = *start;
        *start = *end;
        *end = temp;

        start ++;
        end--;
        
    }

    
}

int main()
{
    char arr[20];
   
    printf("Enter string : ");
    scanf("%[^'\n']s",arr);

    Reverse(arr);
    printf(arr);

    return 0;
}