//  write a recursive program which display below pattern.
// output : *   *   *   *   *

#include<stdio.h>

void Display()
{
    static int iCnt = 0;

    if(iCnt < 5)
    {
        printf("*\t");
        iCnt++;

        Display();
    }
}
int main()
{
    Display();

    return 0;
}