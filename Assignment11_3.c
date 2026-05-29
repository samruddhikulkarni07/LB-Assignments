//Write a program which accepts range from user and return addition of all numbers in between that range
//(Range should contain positive numbers only)

#include<stdio.h>

int RangeSum(int iStart, int iEnd)
{
    int iCnt = 0;
    int iSum = 0;

    if(iEnd < iStart || iStart < 0 || iEnd < 0)
    {
        printf("Invalid range\n");
        return -1;
    
    }

    for(iCnt = iStart; iCnt <= iEnd; iCnt++)
    {
        iSum = iSum + iCnt;
        
    }
    return iSum;
   
}

int main()
{
    int iValue1 = 0;
    int iValue2 = 0;
    int iRet = 0;

    printf("Enter starting point :");
    scanf("%d",&iValue1);

    printf("Enter Endding point :");
    scanf("%d",&iValue2);

    iRet = RangeSum(iValue1, iValue2);

    if(iRet != -1)
    {
        printf("Addition is : %d",iRet);
    }
    
    return 0;
}