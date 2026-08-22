// Write a progarm to check whether a given number is a ArmStrong Number or not.
// A number is called ArmStrong number if the (sum of each digit raised to power of total digits) = number
// Ex : 153
// 1^3 + 5^3 + 3^3 = 153

import java.util.Scanner;

class NumberX
{
    public boolean CheckArmstrongNumber(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;
        int temp = 0;
        int iSum = 0;

        temp = iNo;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        iNo = temp;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            
            iSum = iSum + (int)Math.pow(iDigit,iCount);

            if(iSum > temp)
            {
                break;
            }

            iNo = iNo / 10;

        }

        if(iSum == temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class Assignment54_2X
{
    public static void main(String A[])
    {
        int iNo = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        NumberX nobj = new NumberX();

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        bRet = nobj.CheckArmstrongNumber(iNo);

        if(bRet == true)
        {
            System.out.println("It is Armstrong number");
        }
        else 
        {
            System.out.println("It is not Armstrong number");
        }

    }




}