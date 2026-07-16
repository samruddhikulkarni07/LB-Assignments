// Write a program which accepts one number from user and range of position from user. 
// Toggle all bits from that range.

#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBitRange(UINT iNo, int iStart, int iEnd)
{
    UINT iMask = 0X1;
    int iCnt = 0;

    iMask = iMask << (iStart - 1);

    for(iCnt = iStart; iCnt <= iEnd; iCnt++)
    {
        iNo = iNo ^ iMask;
        iMask = iMask << 1;
    }

    return iNo;

}
int main()
{
    UINT iValue = 0;
    UINT iLocation1 = 0;
    UINT iLocation2 = 0;
    UINT iRet = 0;

    printf("Enter first number : ");
    scanf("%d",&iValue);

    printf("Enter first possition : ");
    scanf("%d",&iLocation1);

    printf("Enter second possition : ");
    scanf("%d",&iLocation2);

    iRet = ToggleBitRange(iValue, iLocation1, iLocation2);

    printf("Modified number is : %d",iRet);
    

    return 0;
}