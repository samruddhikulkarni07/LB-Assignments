// Write a program to Check whether number is palindrome or not

class Logic
{
    void CheckPalindrome(int num)
    {
        int iDigit = 0;
        int iRev = 0;
        int iTemp = num;

        while(num != 0)
        {
            iDigit = num % 10;
            iRev = (iRev * 10 ) + iDigit;
            num = num /10;
        }

        if(iRev == iTemp)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }
        
    }
}

class Assignment17_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CheckPalindrome(121);

    }
}