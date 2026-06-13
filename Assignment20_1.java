// Write a program to find sum of all even numbers upto N

class Logic
{
    void SumEvenNumbers(int n)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        System.out.println("Sum of even numbers upto N is :"+iSum);
       

    }

}

class Assignment20_1

{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.SumEvenNumbers(10);
    }
}