//Write a program which accepts number from user and count frequecy of 4 in it

#include<stdio.h>

int CountFour(int iNo)
{
    int iDigit = 0;
    int iFourCount = 0;

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit == 4)
        {
            iFourCount++;
        }
        iNo = iNo / 10;
    }

    return iFourCount;
   
}

int main()
{
    int iValue = 0;
    int iRet = 0;
    
    printf("Enter Number :");
    scanf("%d",&iValue);

    iRet = CountFour(iValue);
    printf("Frequency of 4 in number is : %d",iRet);
    
    return 0;
}