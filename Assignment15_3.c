// Accept N numbers from user and accept one another number as No,return index of last occurance of number
#include<stdio.h>
#include<stdlib.h>

int LastOcc(int Arr[], int iLength, int iNo)
{
    int iCnt = 0;
    int iOcc = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
            iOcc = iCnt;
            
        }
        
    }

    if(iOcc == 0)
    {
        return -1;
    }
    else
    {
        return iOcc;
    }
   
}


int main()
{
    int iSize = 0, iCnt = 0, iValue = 0, iRet = 0;
    int * p = NULL;

    printf("Enter number of elements :");
    scanf("%d",&iSize);

    printf("Enter number :");
    scanf("%d",&iValue);

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

    iRet = LastOcc(p,iSize,iValue);

    if(iRet == -1)
    {
        printf("There is no such element");
    }
    else
    {
        printf("Last occurance of number is %d",iRet);
    }

    free(p);

    return 0;

}