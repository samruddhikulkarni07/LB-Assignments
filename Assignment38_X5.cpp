// Write a generic program to accept N values and reverse the contents.

#include<iostream>
using namespace std;

template<class T>

void Reverse(T *arr, int iSize)
{
    int i = 0;

    cout<<"Actual content of array : \n";
    for(i = 0; i < iSize; i++)
    {
        cout<<arr[i]<<"\t";
    }

    cout<<"\n";

    cout<<"Reversed contents of array : \n";
    for(i = iSize-1; i >= 0; i--)
    {
        cout<<arr[i]<<"\t";
    }

    cout<<"\n";
    
}

int main()
{
    int arr[] = {10,20,30,10,30,40,10,40,10};

    Reverse(arr,9);

    return 0;
}