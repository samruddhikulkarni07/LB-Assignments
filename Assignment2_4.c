//Accept two numers from user and and display frist number in second numbe of time

#include<stdio.h>

void Display(int iNo, int iFrequency)
{
    int iCnt = 0;

    //Updater
    if(iFrequency < 0)
    {
        iFrequency = -iFrequency;
    }

    for(iCnt = 1; iCnt <= iFrequency; iCnt++)
    {
        printf("%d",iNo);
    }
}

int main()
{
    int iValue =0;
    int iCount =0;

    printf("Enter number:");
    scanf("%d",&iValue);

    printf("Enter frequency:");
    scanf("%d",&iCount);

    Display(iValue,iCount);

    return 0;
}