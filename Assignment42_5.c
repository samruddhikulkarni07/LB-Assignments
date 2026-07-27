//  write a recursive program which accept number from user and return its reverse number.
// input  : 523
// output : 325

#include<stdio.h>

int Reverse(int iNo)
{
    int iDigit = 0;
    
    static int iReverse = 0;

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        iReverse = (iReverse * 10) + iDigit;
        iNo = iNo / 10;

        Reverse(iNo);
    }

    return iReverse;
    
}
int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter Number : ");
    scanf("%d",&iValue);

    iRet = Reverse(iValue);

    printf("%d",iRet);

    return 0;
}