// Write a program which accept one number from user and on its first 4 bits  .
// Return modified number.

#include<stdio.h>

typedef unsigned int UINT;

UINT OnBit(UINT iNo)
{
    UINT iMask = 0X0000000F;

    iNo = iNo | iMask;

    return iNo;

}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;

    printf("Enter number to off 7 th bit : ");
    scanf("%d",&iValue);

    iRet = OnBit(iValue);

    printf("Updated number is : %d",iRet);

    return 0;
}