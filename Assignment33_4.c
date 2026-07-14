// Write a program which accept string from user and accept one character .
// Return Index of last occurance of that character.

#include<stdio.h>

int LastChar(const char *str, char ch)
{
    int iCount = 0;
    int iLast = -1;


    while(*str != '\0')
    {
        if(*str == ch)
        {
           iLast = iCount;
           
        }

        iCount++;
    
        str++;

    }

    return iLast;


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

    iRet = LastChar(arr,cValue);

    printf("Character location is : %d",iRet);

    return 0;
}