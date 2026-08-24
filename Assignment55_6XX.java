// Write a progarm to check whether a given number is Trimorphic Number or not.
// A number is called Trimorphic number if 
// its cube ends with number itself
// Input : 4
// 4^3 = 64 -> ends with 4

import java.util.Scanner;

class NumberX
{
    public boolean CheckTrimorphicNumber(int iNo)
    {
        int iCube = 0;
        
        iCube = iNo * iNo * iNo;

        String strNo = String.valueOf(iNo);
        String strCube = String.valueOf(iCube);

        if(strCube.endsWith(strNo))
        {
            return true;
        }
        else
        {
            return false;
        }

        
    }
}
class Assignment55_6XX
{
    public static void main(String A[])
    {
        int iNo = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        NumberX nobj = new NumberX();

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        bRet = nobj.CheckTrimorphicNumber(iNo);

        if(bRet == true)
        {
            System.out.println("It is Trimorphic number");
        }
        else 
        {
            System.out.println("It is not Trimorphic number");
        }

    }




}