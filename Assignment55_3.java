// Write a progarm to check whether a given number is Spy Number or not.
// A number is called Spy number if 
// (sum of digits) = (product of digits)
// Input : 1124
// sum = 1+1+2+4 = 8
// product = 1x1x2x4 = 8

import java.util.Scanner;

class NumberX
{
    public boolean CheckSpyNumber(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;
        int iProduct = 1;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iProduct = iProduct * iDigit;
            iNo = iNo / 10;
        }
        
        if(iSum == iProduct)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
class Assignment55_3
{
    public static void main(String A[])
    {
        int iNo = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        NumberX nobj = new NumberX();

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        bRet = nobj.CheckSpyNumber(iNo);

        if(bRet == true)
        {
            System.out.println("It is Spy number");
        }
        else 
        {
            System.out.println("It is not Spy number");
        }

    }




}