import java.util.*;

class FitnessApp
{
    public int GoalAchievedDays(int StepsRecord[])
    {
        int Goal = 10000;
        int iCount = 0;

        for(int i = 0; i < 7; i++)
        {
            if(StepsRecord[i] >= Goal)
            {
                iCount++;

            }
        }

        return iCount;
    }
    public int MaximumSteps(int StepsRecord[])
    {
        int iMax = StepsRecord[0];

        for(int i = 0; i < 7; i++)
        {
            if(StepsRecord[i] > iMax)
            {
                iMax = StepsRecord[i];

            }
        }

        return iMax;
    }

    
}

class Assignment52_4
{
    public static void main(String A[])
    {
        int steps = 0;
        int StepsRecord[] = new int[7];
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        FitnessApp fobj = new FitnessApp();

        System.out.println("Enter steps of Sevan days : ");

        for(int i = 0; i < 7; i++)
        {
            StepsRecord[i] = sobj.nextInt();
        }

        for(int i = 0; i < 7; i++)
        {
            if(StepsRecord[i] <= 0)
            {
                System.out.println("Invalid input");
                return;
            }
        }

        iRet = fobj.GoalAchievedDays(StepsRecord);
        System.out.println("Goal achieved days : "+iRet);

        iRet = fobj.MaximumSteps(StepsRecord);
        System.out.println("Maximum steps in a week : "+iRet);

        
        
    }
}