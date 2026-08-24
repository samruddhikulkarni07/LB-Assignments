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
        int iCount = 0;
        int iTemp = 0;

        iSquare = iNo * iNo;

        iTemp = iNo;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        int iPow = (int)Math.pow(10,iCount);

        if((iSquare % iPow) == iTemp)
        {
            return true;

        }
        else
        {
            return false;
        }

        

    }
}
class Assignment55_2X
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