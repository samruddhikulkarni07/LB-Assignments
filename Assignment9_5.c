//Write a program which accepts number from user and return difference between summation of even digits and summation of odd digits


#include<stdio.h>

int CountDiff(int iNo)
{
    int iSumEven = 0;
    int iSumOdd = 0;
    int iDiff = 0;
    int iDigit = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while(iNo != 0)
    {
        iDigit = iNo % 10;

        if(iDigit % 2 == 0)
        {
            iSumEven = iSumEven + iDigit;
        }
        else
        {
            iSumOdd = iSumOdd + iDigit;
        }

        iNo = iNo / 10;

    }

    iDiff = iSumEven - iSumOdd;

    return iDiff;

}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number :");
    scanf("%d",&iValue);

    iRet = CountDiff(iValue);
    printf("%d",iRet);

    return 0;
}