//Write a program which accepts distance in kilometer and convert it into meter
// (1 kilometer = 1000 meter)

#include<stdio.h>

int kMtoMeter(int iNo)
{
    int iMeter = 0;

    iMeter = iNo * 1000;

    return iMeter;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter distance :");
    scanf("%d",&iValue);

    iRet = kMtoMeter(iValue);
    printf("Distance in Kilometer is : %d",iRet);

    return 0;
}