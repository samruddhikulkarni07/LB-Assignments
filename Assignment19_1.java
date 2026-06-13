// Write a program to check whether a given year is leap year or not

class Logic
{
    void CheckLeapYaer(int year)
    {
        if((year % 4) == 0)
        {
            System.out.println("Year is Leap year");
        }
        else
        {
            System.out.println("Year is not Leap year");
        }
    }

}

class Assignment19_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CheckLeapYaer(2024);
    }
}