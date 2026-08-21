import java.util.*;

class Matrix
{
    int row;
    int col;
    private int Arr[][];
    private int StudentTotalMarks[];
    private double SubjectAverage[];


    public Matrix(int N, int M)
    {
        row = N;
        col = M;
        Arr = new int[N][M];
        StudentTotalMarks = new int[N];
        SubjectAverage = new double[M];

        for(int i = 0; i < StudentTotalMarks.length; i++)
        {
            StudentTotalMarks[i] = 0;
        }

        for(int i = 0; i < SubjectAverage.length; i++)
        {
            SubjectAverage[i] = 0.0;
        }

    }

    public void AcceptMarks()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter marks of each Subject :");

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(Arr[i][j] < 0 || Arr[i][j] > 100)
                {
                    System.out.println("Invalid input");
                    return;
                }
                
            }
        }

        System.out.println();
    }

    public void Display()
    {
        System.out.println("Subject wise marks of student are : ");

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println();

    }

    public void CalculationOfTotalMarksOfStudent()
    {
        System.out.println("Total marks of each student : ");
        
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                StudentTotalMarks[i] = StudentTotalMarks[i] + Arr[i][j];
            }
            
        }

        for(int i = 0; i < StudentTotalMarks.length; i++)
        {
            System.out.println("Total marks of Student "+(i + 1)+ " are : "+StudentTotalMarks[i]);
            
        }

        System.out.println();
    }

    public void TopperIdentification()
    {
        int Topper = 1;
        int HighestMarks = StudentTotalMarks[0];

        for(int i = 0; i < StudentTotalMarks.length; i++)
        {
            if(StudentTotalMarks[i] > HighestMarks)
            {
                HighestMarks = StudentTotalMarks[i];
                Topper = i + 1;
            }
        }

        System.out.println("Topper : Student "+Topper);

        System.out.println();
    }

    public void AverageOfEachSubject()
    {
        System.out.println("Subject Average : ");
        double SubTotal = 0;
        
        for(int i = 0; i < col; i++)
        {
            for(int j = 0; j < row; j++)
            {
                SubTotal = SubTotal + Arr[j][i];
            }
            SubjectAverage[i] = SubTotal / row;

            SubTotal = 0;
        }

        for(int i = 0; i < SubjectAverage.length; i++)
        {
            System.out.println("Average of subject "+(i + 1)+ " is : "+SubjectAverage[i]);
            
        }

        System.out.println();

    }

    public void FailedStudentIdentification()
    {
        System.out.println("Student Failed : ");

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(Arr[i][j] < 35)
                {
                    System.out.println("Student "+(i + 1));
                }
            }
        }
    }

}

class Assignment53_1
{
    public static void main(String A[])
    {
        int N = 0;
        int M = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of student : ");
        N = sobj.nextInt();

        System.out.println("Enter number of subject : ");
        M = sobj.nextInt();

        if(N <= 0)
        {
            System.out.println("Invalid input");
            return;
            
        }

        if(M <= 0)
        {
            System.out.println("Invalid input");
            return;
            
        }

        Matrix mobj = new Matrix(N, M);

        mobj.AcceptMarks();
        mobj.Display();
        mobj.CalculationOfTotalMarksOfStudent();
        mobj.TopperIdentification();
        mobj.AverageOfEachSubject();
        mobj.FailedStudentIdentification();


    }

}