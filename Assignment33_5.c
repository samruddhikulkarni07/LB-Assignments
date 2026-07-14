// Write a program that accept string from user and reverse that string

#include<stdio.h>

void StrRevX(char *str)
{
    char temp = '\0';
    char *start = NULL;
    char *end = NULL;

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

        start++;
        end--;
    }


}
int main()
{
    char arr[20];
    printf("Enter String :\n");
    scanf("%[^'\n']s",arr);

    StrRevX(arr);

    printf("Modified string is : %s",arr);

    return 0;
}