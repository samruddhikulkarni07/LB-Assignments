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
        int iTemp = 0;
        int iCube = 0;
        int iCount = 0;
        int iPow = 0;

        iTemp = iNo;
        
        iCube = iNo * iNo * iNo;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        iPow = (int)Math.pow(10,iCount);

        if(iCube % iPow == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
class Assignment55_6
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