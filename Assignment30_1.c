// Write a program which displays ASCII table.Table contains symbol,Decimal,Hexadecimal
//  and octal representation of every member from 0 to 255

#include<stdio.h>

void DisplayASCII()
{
    int iCnt = 0;
    
    printf("Symbol\t\tDecimal\t\tHexadecimal\t\tOctal\n");

    for(iCnt = 0; iCnt <= 255; iCnt++)
    {
        printf("%c\t\t%d\t\t%x\t\t\t%o\n",iCnt,iCnt,iCnt,iCnt);
    }
}
int main()
{
    DisplayASCII();

    return 0;
}