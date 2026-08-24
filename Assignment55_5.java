// Write a progarm to check whether a given number is Disarium Number or not.
// A number is called Disarium number if 
// sum of digits raised to their position (starting from 1) equals the number
// Input : 135
// 1^1 + 3^2 + 5^3 = 1+9+125 = 135

import java.util.Scanner;

class NumberX
{
    public boolean CheckDisariumNumber(int iNo)
    {
        int iTemp = 0;
        int iDigit = 0;
        int iCount = 0;
        int iSum = 0;

        iTemp = iNo;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        iNo = iTemp;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iSum = iSum + (int)Math.pow(iDigit, iCount);

            iNo = iNo / 10;
            iCount--;

        }

        if(iSum == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }

        

    }
}
class Assignment55_5
{
    public static void main(String A[])
    {
        int iNo = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        NumberX nobj = new NumberX();

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        bRet = nobj.CheckDisariumNumber(iNo);

        if(bRet == true)
        {
            System.out.println("It is Disarium number");
        }
        else 
        {
            System.out.println("It is not Disarium number");
        }

    }




}