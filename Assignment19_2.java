// Write a program to display grade of students based on marks

class Logic
{
    void DisplayGrade(int marks)
    {
        if(marks >= 85)
        {
            System.out.println("Grade of Student is : O");
        }
        else if((marks >= 70) && (marks < 85))
        {
            System.out.println("Grade of Student is : A");
        }
        else if((marks >= 55) && (marks < 70))
        {
            System.out.println("Grade of Student is : B");
        }
        else if((marks >= 40) && (marks < 55))
        {
            System.out.println("Grade of Student is : c");
        }
        else if((marks >= 35) && (marks < 40))
        {
            System.out.println("Grade of Student is : D");
        }
        else
        {
            System.out.println("Grade of Student is : F");
        }

    }

}

class Assignment19_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.DisplayGrade(82);
    }
}