import java.util.*;

class UniversityResult
{
    public int CalculateResult(int Marks[])
    {
        int i = 0;
        int iAvg = 0;

        for(i = 0; i < Marks.length; i++)
        {
            if(Marks[i] < 0 || Marks[i] > 100)
            {
                return -1;
            }
        }

        if(Marks[0] < 35 || Marks[1] < 35 || Marks[2] < 35 || Marks[4] < 35)
        {
            return 1;

        }

        iAvg = (Marks[0] + Marks[1] + Marks[2] + Marks[3] + Marks[4]) / 5;

        return iAvg;

    }
}
class Assignment48_3
{
    public static void main(String A[])
    {
        int Arr[] = new int[5];
        int i = 0;
        int iRet = 0;
    
        Scanner sobj = new Scanner(System.in);
        UniversityResult uobj = new UniversityResult();

        System.out.println("Enter your marks of all subjects : ");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();

        }

        iRet = uobj.CalculateResult(Arr);

        if(iRet == -1)
        {
            System.out.println("Invalid Marks");
        }
        else if(iRet == 1)
        {
            System.out.println("Student is fail");
        }
        else
        {
            System.out.println("Average marks of student are : "+iRet);

            if(iRet >= 75)
            {
                System.out.println("Student passes with - Distinction");
            }
            else if(iRet >= 60 && iRet < 75)
            {
                System.out.println("Student passes with - First Class");
            }
            else if(iRet >= 50 && iRet < 60)
            {
                System.out.println("Student passes with - second Class");
            }
            else
            {
                System.out.println("Student is passed");

            }
        }

    }

}