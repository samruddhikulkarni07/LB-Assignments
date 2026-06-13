// Write a program to check whether number is positive , negative or zero

class Logic
{
    void CheckSign(int num)
    {
        if(num == 0)
        {
            System.out.println("Number is Zero");
        }
        else if(num > 0)
        {
            System.out.println("Number is positive");
        }
        else
        {
            System.out.println("Number is negative");
        }
    }

}

class Assignment18_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CheckSign(-8);
    }
}