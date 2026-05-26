//Write a program which accept N from user and print first 5 multiples of N 

#include<stdio.h>

void MultipleDisplay(int iNo)
{
    int iCnt = 0;

    for(iCnt = 1; iCnt <= 5; iCnt++)
    {
        printf("%d\t",iNo * iCnt);
    }


}

int main()
{
    int iValue = 0;

    printf("Enter number:");
    scanf("%d",&iValue);

    MultipleDisplay(iValue);
    
    return 0;
}

// Time complexity : O(N)
// where N >= 0