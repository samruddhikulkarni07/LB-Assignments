// Write a program to print numbers from N down to 1 in reverse order

class Logic
{
    void PrintReverse(int n)
    {
        int iCnt = 0;

        for(iCnt = n; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }
       

    }

}

class Assignment20_2

{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.PrintReverse(10);
    }
}