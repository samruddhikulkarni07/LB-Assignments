// Accept character from user and check whether it is special symbol or not 
// (!,@,#,$,%,^,&,*)

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkSpecial(char ch)
{
    if(ch == 33 || ch == 64 || (ch >= 35 && ch <= 38) || ch == 94  || ch == 42)
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }

}

int main()
{
    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter the character : \n");
    scanf("%c",&cValue);

    bRet = ChkSpecial(cValue);

    if(bRet == TRUE)
    {
        printf("It is special character");
    }
    else
    {
        printf("It is not special symbol");
    }

    return 0;

}
