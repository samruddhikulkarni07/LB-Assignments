// Write a program which accepts one number from user and count number of 
// ON(1) bits in it without using % and / operator.

#include<stdio.h>

typedef unsigned int UINT;

int CountOne(UINT iNo)
{
    UINT iMask = 0X1;
    int iCnt = 0;
    int iCount = 0;

    for(iCnt = 1; iCnt <= 32; iCnt++)
    {
        if(iMask == (iNo & iMask))
        {
            iCount++;
        }
        
        iMask = iMask << 1;
    }

    return iCount;

}
int main()
{
    UINT iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = CountOne(iValue);
    printf("Number of ON bits are : %d",iRet);

    return 0;
}