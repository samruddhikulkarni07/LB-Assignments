//Write a program which accepts number from user and count frequecy of such a digits which are less than 6

#include<stdio.h>

int Count(int iNo)
{
    int iDigit = 0;
    int iCount = 0;

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit < 6)
        {
            iCount++;
        }
        iNo = iNo / 10;
    }

    return iCount;
   
}

int main()
{
    int iValue = 0;
    int iRet = 0;
    
    printf("Enter Number :");
    scanf("%d",&iValue);

    iRet = Count(iValue);
    printf("Frequency of digits which are less than 6 in number is : %d",iRet);
    
    return 0;
}