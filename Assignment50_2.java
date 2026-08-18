import java.util.*;

class ScholarshipCommittee
{
    public void Approval(int iMarks, int iAttendance, int income)
    {
        if(iMarks < 0 || iMarks > 100 ||
          iAttendance < 0 || iAttendance > 100 ||
           income < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(iMarks >= 80 && iAttendance >= 75 && income <= 300000)
        {
            System.out.println("Scholarship Approved");
        }
        else
        {
            if(iMarks < 80)
            {
                System.out.println("Scholarship is rejected : due to Marks");
            }
            else if(iAttendance < 75)
            {
                System.out.println("Scholarship is rejected : due to attendance");
            }
            else
            {
                System.out.println("Scholarship is rejected : due to income");
            }
            
            
        }
        
    }
}
class Assignment50_2
{
    public static void main(String A[])
    {
        int iMarks= 0;
        int iAttendance = 0;
        int income = 0;
        
        Scanner sobj = new Scanner(System.in);
        ScholarshipCommittee cobj = new ScholarshipCommittee();
        
        System.out.println("Enter your marks in percentage : ");
        iMarks = sobj.nextInt();

        System.out.println("Enter your attendance in percentage : ");
        iAttendance = sobj.nextInt();

        System.out.println("Enter income : ");
        income = sobj.nextInt();


       cobj.Approval(iMarks, iAttendance, income);

        
    }
}