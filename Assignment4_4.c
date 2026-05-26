//Write a program which accept number from user and display summation of all its non factors

#include<stdio.h>

int SumNonFact(int iNo)
{
    int iCnt = 0;
    int iSum = 0;

    for(iCnt = 2; iCnt <= (iNo - 1); iCnt++)
    {
        if(iNo % iCnt != 0)
        {
            iSum = iSum + iCnt;
        }
    }

    return iSum;

}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number:");
    scanf("%d",&iValue);

    iRet = SumNonFact(iValue);
    printf("Summation of all non factors of number is : %d",iRet);
    
    return 0;
}

// Time complexity : O(N)
// where N >= 0