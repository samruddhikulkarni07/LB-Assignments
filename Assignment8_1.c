//Write a program which accepts radius of circle from user and calculates its area
//Consider value of PI as 3.14 .(Area = PI * Radius * Radius)

#include<stdio.h>

double CircleArea(float fRadius)
{
    const float PI = 3.14;
    double dArea = 0.0;

    dArea = PI * fRadius * fRadius;

    return dArea;
}

int main()
{
    float fValue = 0.0;
    double dRet = 0.0;

    printf("Enter radius of circle :");
    scanf("%f",&fValue);

    dRet = CircleArea(fValue);
    printf("Area of circle is : %lf",dRet);

    return 0;
}