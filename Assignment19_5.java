// Write a program to calculate the power of a number using loops
class Logic
{
    void CalculatePower(int base, int exp)
    {
        int iRet = 0;
        int iCnt = 0;

        for(iCnt = 1, iRet = 1; iCnt <= exp; iCnt++)
        {
            iRet = iRet * base;
        }

        System.out.println("Required output is :"+iRet);
       

    }

}

class Assignment19_5

{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CalculatePower(2, 5);
    }
}