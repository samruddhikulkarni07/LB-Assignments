//Write a program which accepts number from user and display its table

#include<stdio.h>

void Table(int iNo)
{
    int iCnt = 0;
    
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt <= 10; iCnt++)
    {
        printf("%d\t",iNo * iCnt);
    }


}

int main()
{
    int iValue = 0;

    printf("Enter number:");
    scanf("%d",&iValue);

    Table(iValue);
    
    return 0;
}

//time complexity : O(N)
//where N is greater than or equal to 0