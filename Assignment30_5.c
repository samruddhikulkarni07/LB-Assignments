// Accept character from user and display its ASCII value in decimal,octal
// and hexadecimal format.

#include<stdio.h>

void Display(char ch)
{
    printf("Decimal\t%d\n",ch);
    printf("Octal\t%o\n",ch);
    printf("Hexadecimmal\t0X%X\n",ch);
}
int main()
{
    char cValue = '\0';

    printf("Enter the character : \n");
    scanf("%c",&cValue);

    Display(cValue);

    return 0;
}