//Write a program which accepts number from user and return the count of even digits


#include<stdio.h>

int CountEven(int iNo)
{
    int iEvenCnt = 0;
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
            iEvenCnt = iEvenCnt + 1;
        }

        iNo = iNo / 10;

    }

    return iEvenCnt;

}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number :");
    scanf("%d",&iValue);

    iRet = CountEven(iValue);
    printf("%d",iRet);

    return 0;
}