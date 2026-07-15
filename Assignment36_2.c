// Write a program which accept one number from user and off 7th and 10th bit of that number 
// if it is on.Return modified number.

#include<stdio.h>

typedef unsigned int UINT;

UINT OffBit(UINT iNo)
{
    UINT iMask = 0XFFFFFDBF;

    iNo = iNo & iMask;

    return iNo;

}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;

    printf("Enter number to off 7 th bit : ");
    scanf("%d",&iValue);

    iRet = OffBit(iValue);

    printf("Updated number is : %d",iRet);

    return 0;
}