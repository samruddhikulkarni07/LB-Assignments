//Write a program which accept string from user and return difference between 
// frequency of small character and frequency of capital characters

#include<stdio.h>

int Difference(const char *str)
{
    int iCntSmall = 0;
    int iCntCapital = 0;
    int iDiff = 0;

    while(*str != '\0')
    {
        if(*str >= 'a' && *str <= 'z')
        {
            iCntSmall++;
            
        }
        else
        {
            iCntCapital++;
        }
        str++;

    }

    iDiff = iCntSmall - iCntCapital;

    return iDiff;
}

int main()
{
    char arr[20];
    int iRet = 0;

    printf("Enter string : ");
    scanf("%[^'\n']s",arr);

    iRet = Difference(arr);
    printf("%d",iRet);

    return 0;
}