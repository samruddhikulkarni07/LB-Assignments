// Accept number of rows and number of columns from user and display below pattern
// Input : iRow = 4    iCol = 5

// Output : 2   4   6   8   10    
//          1   3   5   7   9   
//          2   4   6   8   10  
//          1   3   5   7   9   



#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    int i = 0;
    int j = 0;
    int iCnt = 0;
    
    

    for(i = 1; i <= iRow; i++)
    {
        if(i % 2 == 0)
        {
            for(j = 1, iCnt = 1; j <= iCol; j++, iCnt = iCnt+2)
            {
                printf("%d\t",iCnt);
            }
        }
        else
        {
            for(j = 1, iCnt = 2; j <= iCol; j++, iCnt = iCnt+2)
            {
                printf("%d\t",iCnt);
            }

        }
        printf("\n");
    }
    
}
int main()
{
    int iValue1 = 0, iValue2 = 0;

    printf("Enter number of rows and columns :");
    scanf("%d %d",&iValue1, &iValue2);

    Pattern(iValue1, iValue2);

    return 0;
}