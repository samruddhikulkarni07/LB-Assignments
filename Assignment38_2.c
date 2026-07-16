// Write a program which accepts two numbers from user and display position of 
// common ON(1) bits from that two numbers.

#include<stdio.h>

typedef unsigned int UINT;

void CommonBits(UINT iNo1, UINT iNo2)
{
    UINT iMask = 0X1;
    int iCnt = 0;
    

    for(iCnt = 1; iCnt <= 32; iCnt++)
    {
        if((iMask == (iNo1 & iMask)) && (iMask == (iNo2 & iMask)))
        {
            printf("%d\t",iCnt);
        }
        
        iMask = iMask << 1;
    }

    

}
int main()
{
    UINT iValue1 = 0;
    UINT iValue2 = 0;
    int iRet = 0;

    printf("Enter first number : ");
    scanf("%d",&iValue1);

    printf("Enter second number : ");
    scanf("%d",&iValue2);

    CommonBits(iValue1, iValue2);
    

    return 0;
}