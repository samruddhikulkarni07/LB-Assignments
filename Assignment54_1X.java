// Write a progarm to check whether a given number is a Strong Number or not.
// A number is called strong number if the sum of factorial of each digit is equal to the number itself.
// Ex : 145
// 1! + 4! + 5! = 1 + 24 + 120 = 145

import java.util.Scanner;

class NumberX
{
    public boolean CheckStrongNumber(int iNo)
    {
        int temp = 0;
        int iDigit = 0;
        long iSum = 0;
        long iFactorial = 1;

        temp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            while(iDigit != 0)
            {
                iFactorial = iFactorial * iDigit;
                iDigit--;
            }

            iSum = iSum + iFactorial;

            if(iSum > temp)
            {
                break;
            }

            iNo = iNo / 10;
            iFactorial = 1;
        }

        if(iSum == temp)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
class Assignment54_1X
{
    public static void main(String A[])
    {
        int iNo = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        NumberX nobj = new NumberX();

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        bRet = nobj.CheckStrongNumber(iNo);

        if(bRet == true)
        {
            System.out.println("It is Strong number");
        }
        else 
        {
            System.out.println("It is not Strong number");
        }

    }




}