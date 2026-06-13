// Write a program to find Smallest digit in a given number

class Logic
{
    void FindSmallestDigit(int num)  
    {
    
        int iDigit = 0;
        int iSmallestDigit = 9;     //  because digits are 0 to 9

        while(num > 0)
        {
            iDigit = num % 10;

            if(iDigit < iSmallestDigit)
            {
                iSmallestDigit = iDigit;
            }

            num = num / 10;

        }

        System.out.println("Smallest digit is :"+iSmallestDigit);

    }

}

class Assignment20_5

{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.FindSmallestDigit(45872);
    }
}