//Write a program which accept string from user and check whether it contains 
// vowels in it or not

#include<stdio.h>
#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkVowel(const char *str)
{
    BOOL bFlag = FALSE;

    while(*str != '\0')
    {
        if(*str == 'a' || *str == 'e' || *str == 'i' || *str == 'o' || *str == 'u' ||
           *str == 'A' || *str == 'E' || *str == 'I' || *str == 'O' || *str == 'U')
        {
           
            bFlag = TRUE;
            break;
        }
        else
        {
            bFlag = FALSE;
        }
        str++;

    }

    return bFlag;
}

int main()
{
    char arr[20];
    BOOL bRet = FALSE;


    printf("Enter string : ");
    scanf("%[^'\n']s",arr);

    bRet = ChkVowel(arr);

    if(bRet == TRUE)
    {
        printf("Contains vowel");

    }
    else
    {
        printf("There is no vowel");
    }

    return 0;
}