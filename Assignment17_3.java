// Write a program to find maximum of two numbers

class Logic
{
    void findMax(int a, int b)
    {
        if(a > b)
        {
            System.out.println("Maximum number is : "+a);
        }
        else
        {
            System.out.println("Maximum number is : "+b);
        }
        
    }
}

class Assignment17_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findMax(20,15);

    }
}