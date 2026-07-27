//  write a recursive program which accept number from user and return largest digit.
// input  : 87983
// output : 9

#include<stdio.h>

int Max(int iNo)
{
    int iDigit = 0;
    
    static int largest = 0;

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit > largest)
        {
            largest = iDigit;
        }

        iNo = iNo / 10;

        Max(iNo);
    }

    return largest;
    
}
int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter Number : ");
    scanf("%d",&iValue);

    iRet = Max(iValue);

    printf("%d",iRet);

    return 0;
}