// Write a program which accepts one number from user and toggle contents of first and last 
//  nibble of the number .
// Return modifid number.(Nibble is the group of four bits)

#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo)
{
    UINT iMask = 0XF000000F;
    UINT iResult = 0;

    iResult = iNo ^ iMask;

    return iResult;


}
int main()
{
    UINT iValue = 0;
    UINT iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = ToggleBit(iValue);

    printf("Modified Number is : %d ",iRet);
    
    return 0;
}