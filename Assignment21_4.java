// Write a program to count total number of factors of a given number

class Logic
{
    void CountFactors(int num)  
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 1; iCnt <= (num /2); iCnt++)
        {
            if((num % iCnt) == 0)
            {
                iCount++;
            }
        }

        System.out.println("Toatal number of factors of a given number is : "+iCount);
    }

}

class Assignment21_4

{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CountFactors(20);
    }
}