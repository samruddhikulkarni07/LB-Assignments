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
    
        iTemp = iNo;
        
        iCube = iNo * iNo * iNo;

        while(iNo != 0)
        {
            if((iNo % 10) != (iCube % 10))
            {
                break;
            }

            iNo = iNo / 10;
            iCube = iCube / 10;
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
class Assignment55_6X
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