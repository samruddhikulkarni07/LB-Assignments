//Write a program which accepts number from user and return the count of odd digits


#include<stdio.h>

int CountOdd(int iNo)
{
    int iOddCnt = 0;
    int iDigit = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while(iNo != 0)
    {
        iDigit = iNo % 10;

        if(iDigit % 2 != 0)
        {
            iOddCnt = iOddCnt + 1;
        }

        iNo = iNo / 10;

    }

    return iOddCnt;

}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number :");
    scanf("%d",&iValue);

    iRet = CountOdd(iValue);
    printf("%d",iRet);

    return 0;
}