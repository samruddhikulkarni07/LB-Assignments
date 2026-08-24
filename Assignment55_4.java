// Write a progarm to check whether a given number is Sunny Number or not.
// A number is called Sunny number if num+1 is a perfect square
// Input : 8
// 8+1 = 9 -> 9 is perfect square

import java.util.Scanner;

class NumberX
{
    public boolean CheckSunnyNumber(int iNo)
    {
        int iCnt = 1;
        boolean bFlag = false;

        iNo = iNo + 1;

        while(iCnt <= (iNo / 2))
        {
            if((iNo % iCnt == 0) && (iNo / iCnt == iCnt))
            {
                bFlag = true;
                break;
            }
            
            iCnt++;
            
        }

        return bFlag;

    }
}
class Assignment55_4
{
    public static void main(String A[])
    {
        int iNo = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        NumberX nobj = new NumberX();

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        bRet = nobj.CheckSunnyNumber(iNo);

        if(bRet == true)
        {
            System.out.println("It is Sunny number");
        }
        else 
        {
            System.out.println("It is not Sunny number");
        }

    }




}