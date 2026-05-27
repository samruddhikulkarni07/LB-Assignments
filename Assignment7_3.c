//Write a program to find even factoriaal of given number
#include<stdio.h>

int EvenFactorial(int iNo)
{
    int iCnt = 0;
    int iFactorial = 1;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = iNo; iCnt >= 1; iCnt--)
    {
        if(iCnt % 2 == 0)
        {
            iFactorial = iFactorial * iCnt;
        }
        
    }

    return iFactorial;

}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number:");
    scanf("%d",&iValue);

    iRet = EvenFactorial(iValue);
    printf("Even Factorial of number is %d",iRet);

    return 0;
}

//time complexity : O(N)
//where N is greater than or equal to 0