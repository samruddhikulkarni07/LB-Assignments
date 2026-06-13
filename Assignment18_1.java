// Write a program to check whether a number is prime or not

class Logic
{
    void checkPrime(int num)
    {
        int iCnt = 0;
        boolean bFlag = false;

        for(iCnt = 2; iCnt < (num / 2); iCnt++)
        {
            if((num % iCnt) == 0)
            {
                bFlag = true;

            }
        }

        if(bFlag == true)
        {
            System.out.println("Number is not prime");
        }

        else
        {
            System.out.println("Number is prime");

        }
    }

}

class Assignment18_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}