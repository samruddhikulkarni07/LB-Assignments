// Write a program which accept one number from user and toggle 7th and  10th bit of that number .
// Return modified number.

#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo)
{
    UINT iMask = 0X240;

    iNo = iNo ^ iMask;

    return iNo;

}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;

    printf("Enter number to off 7 th bit : ");
    scanf("%d",&iValue);

    iRet = ToggleBit(iValue);

    printf("Updated number is : %d",iRet);

    return 0;
}