// Write a progarm to check whether a given number is Neon Number or not.
// A number is called Neon number if the sum of digits of its square equals the number.
// Input : 9
// Output : 9^2 = 81
// 8 + 1 = 9

import java.util.Scanner;

class NumberX
{
    public boolean CheckNeonNumber(int iNo)
    {
        int iSquare = 0;
        int iDigit = 0;
        int iSum = 0;

        iSquare = iNo * iNo;

        while(iSquare != 0)
        {
            iDigit = iSquare % 10;

            iSum = iSum + iDigit;

            iSquare = iSquare / 10;

        }

        if(iNo == iSum)
        {
            return true;
        }
        else
        {
            return false;
        }
    
    }
}
class Assignment55_1
{
    public static void main(String A[])
    {
        int iNo = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        NumberX nobj = new NumberX();

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        bRet = nobj.CheckNeonNumber(iNo);

        if(bRet == true)
        {
            System.out.println("It is Neon number");
        }
        else 
        {
            System.out.println("It is not Neon number");
        }

    }




}