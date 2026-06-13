// Write a program to find largest digit in a number

class Logic
{
    void FindLargestDigit(int num)  //83429
    {
    
        int iDigit = 0;
        int iLargestDigit = 0;

        while(num > 0)
        {
            iDigit = num % 10;

            if(iDigit > iLargestDigit)
            {
                iLargestDigit = iDigit;
            }

            num = num / 10;

        }

        System.out.println("Largest digit is :"+iLargestDigit);

    }

}

class Assignment20_4

{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.FindLargestDigit(83429);
    }
}