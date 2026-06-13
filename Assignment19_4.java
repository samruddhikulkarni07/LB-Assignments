// Write a program to print each digit of number separately

class Logic
{
    void PrintDigits(int num)
    {
       int iDigit = 0;

       while(num > 0)
       {
            iDigit = num % 10;
            System.out.println(iDigit);
            num = num / 10;
       }

    }

}

class Assignment19_4

{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.PrintDigits(9876);
    }
}