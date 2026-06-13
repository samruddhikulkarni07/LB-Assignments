// Write a program to count how many even and odd numbers are present between 1 to N

class Logic
{
    void CountEvenOddRange(int n)  
    {
        int iCnt = 0;
        int iEvenCount = 0;
        int iOddCount = 0;

        for(iCnt = 2; iCnt < n; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEvenCount++;
            }
            else
            {
                iOddCount++;
            }
        }

        System.out.println("Even Count is : "+iEvenCount);
        System.out.println("Odd Count is : "+iOddCount);
        

    }

}

class Assignment21_2

{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CountEvenOddRange(50);
    }
}