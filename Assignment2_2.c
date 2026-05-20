//Accept one number from user and print that numer of * on screen

#include<stdio.h>

void Display(int iNo)
{
    //Updater
    if(iNo<0)
    {
        iNo = -iNo;
    }

    while(iNo>0)
    {
        printf("*");
        iNo--;
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number:");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}