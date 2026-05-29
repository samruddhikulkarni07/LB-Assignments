//Write a program which accepts number from user and check whether it contains 0 in it or not

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL CheckZero(int iNo)
{
    int iDigit = 0;
    int iZeroCount = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit == 0)
        {
            iZeroCount++;
        }
        iNo = iNo / 10;
    }

    if(iZeroCount > 0)
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
    int iValue = 0;
    BOOL bRet = FALSE;
    
    printf("Enter Number :");
    scanf("%d",&iValue);

    bRet = CheckZero(iValue);

    if(bRet == TRUE)
    {
        printf("It contains zero");
    }
    else
    {
        printf("There is no zero");
    }
    
    return 0;
}