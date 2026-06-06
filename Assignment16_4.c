// Accept N numbers from user and display all such numbers which contains 3 digits in it

#include<stdio.h>
#include<stdlib.h>

void Digits(int Arr[], int iLength)
{
    int iCnt = 0;
    int iCount = 0;
    int iTemp = 0;
    
    
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        iCount = 0;
        iTemp = Arr[iCnt];

        while(iTemp > 0)
        {
            iCount = iCount + 1;
            iTemp = iTemp / 10;
        }

        if(iCount == 3)
        {
            printf("%d\t",Arr[iCnt]);
        }
        
    }

    
}


int main()
{
    int iSize = 0, iCnt = 0;
    int * p = NULL;

    printf("Enter number of elements :");
    scanf("%d",&iSize);

    p = (int *) malloc (iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter %d elements\n",iSize);

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter elements : %d\n",iCnt+1);
        scanf("%d",&p[iCnt]);
    }

    Digits(p,iSize);

    free(p);

    return 0;

}