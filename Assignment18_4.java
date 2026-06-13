// Write a program to find the sum of even and odd digits separately in a number

class Logic
{
    void SumEvenOddDigits(int num)
    {
        int iDigit = 0;
        int iEvenSum = 0;
        int iOddSum = 0;

        while(num > 0)
        {
            iDigit = num % 10;

            if((iDigit % 2) == 0)
            {
                iEvenSum = iEvenSum + iDigit;
            }
            else
            {
                iOddSum = iOddSum + iDigit;
            }

            num = num /10;
        }

        System.out.println("Sum of Even digits is : "+iEvenSum);

        System.out.println("Sum of Odd digits is : "+iOddSum);
    }

}

class Assignment18_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.SumEvenOddDigits(123456);
    }
}