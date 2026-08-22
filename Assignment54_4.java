// Write a progarm to check whether a given number is a Harshad Number or not.
// A number is called Harshad number if it is divisible by sum of its digits.
// Ex : 18
// 1 + 8 = 9
//18 % 9 = 0

import java.util.Scanner;

class NumberX
{
    public boolean CheckHarshadNumber(int iNo)
    {
        int temp = 0;
        int iSum = 0;
        int iDigit = 0;

        temp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iSum = iSum + iDigit;

            iNo = iNo / 10;

        }

        if(temp % iSum == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    
    }
}
class Assignment54_4
{
    public static void main(String A[])
    {
        int iNo = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        NumberX nobj = new NumberX();

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        bRet = nobj.CheckHarshadNumber(iNo);

        if(bRet == true)
        {
            System.out.println("It is Harshad number");
        }
        else 
        {
            System.out.println("It is not Harshad number");
        }

    }




}