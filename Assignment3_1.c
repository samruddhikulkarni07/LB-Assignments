//Write a program which accepts one number from user and print that number of even numbers on screen

#include<stdio.h>

void PrintEven(int iNo)
{
    if(iNo <= 0)
    {
        return;
    }

    int iCnt = 0;
    int EvenNo = 0;

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        
        EvenNo = iCnt * 2;
        printf("%d\n",EvenNo);
        
    }

}

int main()
{
    int iValue = 0;

    printf("Enter number:");
    scanf("%d",&iValue);

    PrintEven(iValue);

    return 0;
}