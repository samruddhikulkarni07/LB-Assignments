// Write a progarm to check whether a given number is Automorphic Number or not.
// A number is called Automorphic number if its square ends with the same digit as the number
// Input : 25
// Output : 25^2 = 625 -> ends with 25
// 

import java.util.Scanner;

class NumberX
{
    public boolean CheckAutomorphicNumber(int iNo)
    {
        int iSquare = 0;

        iSquare = iNo * iNo;

        while(iNo != 0)
        {
            if(iNo % 10 != iSquare % 10)
            {
                break;
            }
            iNo = iNo / 10;
            iSquare = iSquare / 10;
        }

        if(iNo == 0)
        {
            return true;

        }
        else
        {
            return false;
        }

        

    }
}
class Assignment55_2XX
{
    public static void main(String A[])
    {
        int iNo = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        NumberX nobj = new NumberX();

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        bRet = nobj.CheckAutomorphicNumber(iNo);

        if(bRet == true)
        {
            System.out.println("It is Automorphic number");
        }
        else 
        {
            System.out.println("It is not Automorphic number");
        }

    }




}