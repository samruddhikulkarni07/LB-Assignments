// Write a program which accepts one number and position from user and check whether bit at
// that position is on or off. If bit is one return TRUE otherwise return FALSE.

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;
typedef unsigned int UINT;

BOOL ChkBit(UINT iNo, int iPos)
{
    UINT iMask = 0X1;
    UINT iResult = 0;

    iMask = iMask << (iPos - 1);

    iResult = iNo & iMask;

    if(iResult == iMask)
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
    UINT iValue = 0;
    UINT iLocation = 0;
    BOOL bRet = FALSE;

    printf("Enter number to check bit is ON or OFF : ");
    scanf("%d",&iValue);

    printf("Enter bit position : ");
    scanf("%d",&iLocation);

    bRet = ChkBit(iValue, iLocation);
    
    if(bRet == TRUE)
    {
        printf("Bit at that position is ON ");
    }
    else
    {
        printf("Bit at that position is OFF");
    }

    return 0;
}