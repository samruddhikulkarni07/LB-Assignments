// Write a program which accepts one number and position from user and onn that bit .
// Return modifid number.

#include<stdio.h>

typedef unsigned int UINT;

UINT OnBit(UINT iNo, int iPos)
{
    UINT iMask = 0X1;
    UINT iResult = 0;

    iMask = iMask << (iPos - 1);

    iResult = iNo | iMask;

    return iResult;


}
int main()
{
    UINT iValue = 0;
    UINT iLocation = 0;
    UINT iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    printf("Enter bit position : ");
    scanf("%d",&iLocation);

    iRet = OnBit(iValue, iLocation);

    printf("Modified Number is : %d ",iRet);
    
    return 0;
}