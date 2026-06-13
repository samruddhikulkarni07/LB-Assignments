// Write a program to check whether a number is perfect or not

class Logic
{
    void CheckPerfect(int num)
    {
        int iCnt = 0;
        int iFactorSum = 0;

        for(iCnt = 1; iCnt <= (num / 2); iCnt++)
        {
            if((num % iCnt) == 0)
            {
                iFactorSum = iFactorSum + iCnt;
            }
            
        }

        if(iFactorSum == num)
        {
            System.out.println("Number is perfect");
        }
        else
        {
            System.out.println("Number is not perfect");
        }
       

    }

}

class Assignment20_3

{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CheckPerfect(6);
    }
}