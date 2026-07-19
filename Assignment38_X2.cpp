// Write a generic program which accepts N values and count frequency of any specifc value

#include<iostream>
using namespace std;

template<class T>

int Frequency(T *arr, int iSize, T No)
{
    int iCount = 0;
    int i = 0;

    for(i = 0; i < iSize; i++)
    {
        if(arr[i] == No)
        {
            iCount++;
        }
    }

    return iCount;
    
}

int main()
{
    int arr[] = {10,20,30,10,30,40,10,40,10};
    int iRet = Frequency(arr,9,10);
    printf("%d\n",iRet); //4

    return 0;
}