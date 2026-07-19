// Write a generic program to find largest number from three numbers

#include<iostream>
using namespace std;

template<class T>

T Max(T no1, T no2, T no3)
{
    if((no1 > no2) && (no1 > no3))
    {
        return no1;
    }
    else if((no2 > no1) && (no2 > no3))
    {
        return no2;
    }
    else
    {
        return no3;
    }
}

int main()
{
    int iRet = Max(12,23,18);
    cout<<iRet<<"\n";

    float fRet = Max(45.8f,27.6f,34.3f);
    cout<<fRet<<"\n";

    double dRet = Max(45.08,23.56,90.97);
    cout<<dRet<<"\n";


    return 0;
}