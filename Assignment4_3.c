//Write a program which accept number from user and display all its non factors

#include<stdio.h>

void NonFact(int iNo)
{
    int iCnt = 0;

    for(iCnt = 2; iCnt <= (iNo - 1); iCnt++)
    {
        if(iNo % iCnt != 0)
        {
            printf("%d\t",iCnt);
        }
    }

}

int main()
{
    int iValue = 0;

    printf("Enter number:");
    scanf("%d",&iValue);

    NonFact(iValue);
    
    return 0;
}

// Time complexity : O(N)
// where N >= 0