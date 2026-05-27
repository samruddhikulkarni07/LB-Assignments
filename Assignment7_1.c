//Write a program which accepts number from user and display below pattern
//input :5
//output :* * * * * # # # # #

#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;
    
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("*\t");
    }
    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("#\t");
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

//time complexity : O(N)
//where N is greater than or equal to 0