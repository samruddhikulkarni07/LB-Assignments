// Write a program which accepts one number, two positions from user and 
// check whether bit at first or bit at second position is on or off.

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;
typedef unsigned int UINT;

BOOL ChkBit(UINT iNo, int iPos1, int iPos2)
{
    UINT iMask1 = 0X1;
    UINT iMask2 = 0X1;

    UINT iResult1 = 0;
    UINT iResult2 = 0;

    iMask1 = iMask1 << (iPos1 - 1);
    iMask2 = iMask2 << (iPos2 - 1);

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
    UINT iLocation1 = 0;
    UINT iLocation2 = 0;
    BOOL bRet = FALSE;

    printf("Enter first number : ");
    scanf("%d",&iValue);

    printf("Enter first possition : ");
    scanf("%d",&iLocation1);

    printf("Enter second possition : ");
    scanf("%d",&iLocation2);

    bRet = ChkBit(iValue, iLocation1, iLocation2);

    if(bRet == TRUE)
    {
        printf("first or second Bit is ON");
    }
    else
    {
        printf("first and second Bits are OFF");
    }
    

    return 0;
}