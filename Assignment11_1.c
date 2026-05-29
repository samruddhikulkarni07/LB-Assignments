//Write a program which accepts range from user and disply all numbers in between that range

#include<stdio.h>

void RangeDisplay(int iStart, int iEnd)
{

    if(iEnd < iStart)
    {
        printf("Invalid range");
    }

    int iCnt = 0;

    for(iCnt = iStart; iCnt <= iEnd; iCnt++)
    {
        printf("%d\t",iCnt);
    }
   
}

int main()
{
    int iValue1 = 0;
    int iValue2 = 0;

    printf("Enter starting point :");
    scanf("%d",&iValue1);

    printf("Enter Endding point :");
    scanf("%d",&iValue2);

    RangeDisplay(iValue1, iValue2);
    
    return 0;
}