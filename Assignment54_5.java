// Write a progarm to check whether a given number is a Palindrome Number or not.
// A number is called Palindrome number if it remains the same when reversed
// Input : 121
// Output : 121

import java.util.Scanner;

class NumberX
{
    public boolean CheckPalindromeNumber(int iNo)
    {
        int iTemp = 0;
        int iDigit = 0;
        int iReverse = 0;

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iReverse = (iReverse * 10) + iDigit;

            iNo = iNo / 10;
        }

        if(iTemp == iReverse)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    
    }
}
class Assignment54_5
{
    public static void main(String A[])
    {
        int iNo = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        NumberX nobj = new NumberX();

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        bRet = nobj.CheckPalindromeNumber(iNo);

        if(bRet == true)
        {
            System.out.println("It is Palindrome number");
        }
        else 
        {
            System.out.println("It is not Palindrome number");
        }

    }




}