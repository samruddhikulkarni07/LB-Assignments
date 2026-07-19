// Write a generic program to accept N values and search first occurance of any specific value

#include<iostream>
using namespace std;

template<class T>

int SearchFirst(T *arr, int iSize, T No)
{
    int iPos = 0;
    int i = 0;

    for(i = 0; i < iSize; i++)
    {
        if(arr[i] == No)
        {
            iPos = i+1;
            break;
        }
    }
    
    return iPos;
}

int main()
{
    int arr[] = {10,20,30,10,30,40,10,40,10};

    int iRet = SearchFirst(arr,9,40);

    printf("%d\n",iRet);            //6

    return 0;
}