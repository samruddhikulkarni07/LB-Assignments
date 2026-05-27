//Write a program which returnd difference between even factorial and odd factorial  of given number
#include<stdio.h>

int FactorialDiff(int iNo)
{
    int iCnt = 0;
    int iEvenFact = 1;
    int iOddFact = 1;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = iNo; iCnt >= 1; iCnt--)
    {
        if(iCnt % 2 == 0)
        {
            iEvenFact = iEvenFact * iCnt;
        }
        else
        {
            iOddFact = iOddFact * iCnt;
        }
        
    }

    return iEvenFact - iOddFact;

}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number:");
    scanf("%d",&iValue);

    iRet = FactorialDiff(iValue);
    printf("Factorial difference of number is %d",iRet);

    return 0;
}

//time complexity : O(N)
//where N is greater than or equal to 0