//Write a program which accepts range from user and disply all numbers in between that range in reverse ordder

#include<stdio.h>

void RangeDisplayRev(int iStart, int iEnd)
{

    if(iEnd < iStart)
    {
        printf("Invalid range");
    }

    int iCnt = 0;

    for(iCnt = iEnd; iCnt >= iStart; iCnt--)
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

    RangeDisplayRev(iValue1, iValue2);
    
    return 0;
}