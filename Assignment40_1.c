//  write a recursive program which display below pattern.
// input  : 5
// output : *   *   *   *   *

#include<stdio.h>

void Display(int iNo)
{
    static int iCnt = 0;

    if(iCnt < iNo)
    {
        printf("*\t");
        iCnt++;
        Display(iNo);
 
    }
}
int main()
{
    int iValue =0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}