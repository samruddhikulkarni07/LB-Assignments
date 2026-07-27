//  write a recursive program which display below pattern.
// input  : 6
// output : a   b   c   d   e   f

#include<stdio.h>

void Display(int iNo)
{
    static int iCnt = 1;
    static char c = 'a';

    if(iCnt <= iNo)
    {
        printf("%c\t",c);
        c++;
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