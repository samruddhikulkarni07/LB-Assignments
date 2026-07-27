//  write a recursive program which accept number from user and display below pattern.
// input  : 5
// output : 5   *   4   *   3   *   2   *   1   *

#include<stdio.h>

void Display(int iNo)
{
    static int iCnt = 1;
    int temp = 0;

    if(iCnt <= iNo)
    {
        temp = iCnt;
        iCnt++;

        Display(iNo);

        printf("%d\t*\t",temp);
        
 
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