//  write a recursive program which display below pattern.
// output : A   B   C   D   E   F

#include<stdio.h>

void Display()
{
    static char c = 'A';

    if(c <= 'F')
    {
        printf("%c\t",c);
        c++;
        Display();
 
    }
}
int main()
{
    Display();

    return 0;
}