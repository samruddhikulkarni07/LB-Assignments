//  write a recursive program which display below pattern.
// input  : 6
// output : A   B   C   D   E   F

#include<stdio.h>

void Display(int iNo)
{
    static int iCnt = 1;
    static char c = 'A';

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