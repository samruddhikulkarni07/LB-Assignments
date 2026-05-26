//Write a program which accept number from user and return differece between summation of all its factors and non factors

#include<stdio.h>

int FactDiff(int iNo)
{
    int iCnt = 0;
    int iFactSum = 0;
    int iNonFactSum = 0;
    int iDiff = 0;

    for(iCnt = 1; iCnt <= (iNo - 1); iCnt++)
    {
        if(iNo % iCnt == 0)
        {
            iFactSum = iFactSum + iCnt;
        }
        else
        {
            iNonFactSum = iNonFactSum + iCnt;
        }
    }

    iDiff = iFactSum - iNonFactSum;

    return iDiff;

}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number:");
    scanf("%d",&iValue);

    iRet = FactDiff(iValue);
    printf("Difference betweeen summation of all factors and non factors of number is : %d",iRet);
    
    return 0;
}

// Time complexity : O(N)
// where N >= 0