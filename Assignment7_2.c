//Accept amount in US Dollar and returns its coresponding value in Indian Currency
//Cnsider 1$ as 70 rupees

#include<stdio.h>

int DollarToINR(int iNo)
{
    int iAns = 0;

    iAns = iNo * 70;

    return iAns;


}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number of USD:");
    scanf("%d",&iValue);

    iRet = DollarToINR(iValue);
    printf("Value in INR is %d",iRet);
    
    return 0;
}

