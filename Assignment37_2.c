// Write a program which accepts one number and position from user and off that bit .
// Return modifid number.

#include<stdio.h>

typedef unsigned int UINT;

UINT OffBit(UINT iNo, int iPos)
{
    UINT iMask = 0X1;
    UINT iResult = 0;

    iMask = iMask << (iPos - 1);

    iMask = ~iMask;

    iResult = iNo & iMask;

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

    iRet = OffBit(iValue, iLocation);

    printf("Modified Number is : %d ",iRet);
    
    return 0;
}