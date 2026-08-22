// Write a progarm to check whether a given number is a perfect Number or not.
// A number is called perfect number if the sum of all proper divisors(excluding the number) is equal to number
// Ex : 28
// 1+2+4+7+14 = 28

import java.util.Scanner;

class NumberX
{
    public boolean CheckPerfectNumber(int iNo)
    {
        int iSum = 0;
        int i = 0;

        if(iNo <= 0)
        {
            return false;
        }

        // Time complexity : N/2
        
        for(i = 1; i <= iNo/2; i++)
        {
            if(iNo % i == 0)
            {
                iSum = iSum + i;
            }

            if(iSum > iNo)
            {
                break;
            }

        }

    
        if(iSum == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class Assignment54_3X
{
    public static void main(String A[])
    {
        int iNo = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        NumberX nobj = new NumberX();

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        bRet = nobj.CheckPerfectNumber(iNo);

        if(bRet == true)
        {
            System.out.println("It is perfect number");
        }
        else 
        {
            System.out.println("It is not perfect number");
        }

    }




}