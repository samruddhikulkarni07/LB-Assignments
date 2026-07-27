//  write a recursive program which display below pattern.
// output : 5   4   3   2   1

#include<stdio.h>

void Display()
{
    static int iCnt = 1;
    int temp = 0;

    if(iCnt <= 5)
    {
        temp = iCnt;
        iCnt++;
        Display();

        printf("%d\t",temp);
    }
}
int main()
{
    Display();

    return 0;
}