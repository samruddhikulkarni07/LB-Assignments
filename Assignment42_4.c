//  write a recursive program which accept number from user and return smallest digit.
// input  : 87983
// output : 3

#include<stdio.h>

int Min(int iNo)
{
    int iDigit = 0;
    
    static int smallest = 9;

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit < smallest)
        {
            smallest = iDigit;
        }

        iNo = iNo / 10;

        Min(iNo);
    }

    return smallest;
    
}
int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter Number : ");
    scanf("%d",&iValue);

    iRet = Min(iValue);

    printf("%d",iRet);

    return 0;
}