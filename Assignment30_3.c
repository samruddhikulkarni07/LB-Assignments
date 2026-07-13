// Accept character from user. If character is capital then display all the characters 
// from input characters till Z. If input character is small then print all characters 
//in reverse order till a.In other cases return directly.

#include<stdio.h>

void Display(char ch)
{
    char c = '\0';

    if(ch >= 'A' && ch <= 'Z')
    {
        for(c = ch; c <= 'Z'; c++)
        {
            printf("%c\t",c);
        }
    }
    else if(ch >= 'a' && ch <= 'z')
    {
        for(c = ch; c >= 'a'; c--)
        {
            printf("%c\t",c);
        }
    }
    else
    {
        return;
    }
}

int main()
{
    char cValue = '\0';

    printf("Enter the character : \n");
    scanf("%c",&cValue);

    Display(cValue);

    return 0;

}
