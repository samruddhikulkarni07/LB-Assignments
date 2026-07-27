//  write a recursive program which accept number from user and return its product of digits.
// input  : 523
// output : 30

#include<stdio.h>

int Mult(int iNo)
{
    static int iMult = 1;
    int iDigit = 0;
    
    if(iNo != 0)
    {
        iDigit = iNo % 10;
        iMult = iMult * iDigit;
        iNo = iNo / 10;
        Mult(iNo);

    }

    return iMult;
    
    
}
int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = Mult(iValue);

    printf("%d",iRet);

    return 0;
}