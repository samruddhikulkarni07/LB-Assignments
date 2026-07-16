// Write a program which accepts one number from user and 
// check whether 9th or 12th bit is on or off.

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;
typedef unsigned int UINT;

BOOL ChkBit(UINT iNo)
{
    UINT iMask1 = 0X100;
    UINT iMask2 = 0X800;

    UINT iResult1 = 0;
    UINT iResult2 = 0;

    iResult1 = iNo & iMask1;
    iResult2 = iNo & iMask2;

    if((iMask1 == iResult1) || (iMask2 == iResult2))
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
    BOOL bRet = FALSE;

    printf("Enter first number : ");
    scanf("%d",&iValue);

    bRet = ChkBit(iValue);

    if(bRet == TRUE)
    {
        printf("9th or 12th Bit is ON");
    }
    else
    {
        printf("9th and 12th Bits are OFF");
    }
    

    return 0;
}