//  write a recursive program which display below pattern.
// output : a   b   c   d   e   f

#include<stdio.h>

void Display()
{
    static char c = 'a';

    if(c <= 'f')
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