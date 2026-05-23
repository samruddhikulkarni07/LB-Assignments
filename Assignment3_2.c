//Write a program which accept number from user and print factors of that number

#include<stdio.h>

void DisplayFactors(int iNo)
{
    int i = 0;

    if(iNo <= 0)
    {
        iNo = -iNo;
    }

    for(i = 1; i <= iNo-1; i++)
    {
        if(iNo%i == 0)
        {
            printf("%d ",i);
        }
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number\n");
    scanf("%d",&iValue);

    DisplayFactors(iValue);

    return 0;
}