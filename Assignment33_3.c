// Write a program which accept string from user and accept one character .
// Return Index of first occurance of that character.

#include<stdio.h>

int FirstChar(const char *str, char ch)
{
    int iCount = 0;

    while(*str != '\0')
    {
        if(*str == ch)
        {
           return iCount;
           break;
        }

        iCount++;
        

        str++;

    }

    return -1;


}
int main()
{
    char arr[20];
    char cValue = '\0';
    int iRet = 0;

    printf("Enter String : \n");
    scanf("%[^'\n']s",arr);

    printf("Enter the character : \n");
    scanf(" %c",&cValue);

    iRet = FirstChar(arr,cValue);

    printf("Character location is : %d",iRet);

    return 0;
}