// Write a generic program to accept N values from user and return smallest value.

#include<iostream>
using namespace std;

template<class T>

T Min(T *arr, int iSize)
{
    T temp = arr[1];
    int i = 0;

    for(i = 0; i < iSize; i++)
    {
        if(arr[i] < temp)
        {
            temp = arr[i];
        }

    }

    return temp;
    
}

int main()
{
    int arr[] = {10,20,30,40,50};
    float brr[] = {10.0,3.7,9.8,8.7};

    int iRet = Min(arr,5);
    printf("%d\n",iRet);        //10

    float fRet = Min(brr,4);
    printf("%f",fRet);          //3.7

    return 0;
}