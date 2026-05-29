//Write a program which accepts temperature in Fahrenheit and convert it into celcius
// (1 celcius = (Fahrenheit - 32) * (5/9))

#include<stdio.h>

double FHtoCs(float fTemp)
{
    double dCelcius = 0.0;

    dCelcius = (fTemp - 32) * (5.0/9.0);

    return dCelcius;
}

int main()
{
    float fValue = 0.0f;
    double dRet = 0.0;

    printf("Enter temperature in fahrenheit :");
    scanf("%f",&fValue);

    dRet = FHtoCs(fValue);
    printf("Temperature in celcius is : %lf",dRet);

    return 0;
}