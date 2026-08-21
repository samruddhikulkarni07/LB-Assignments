import java.util.*;

interface GetterSetter
{
    void Accept();
    void Display();
}

class Matrix
{
    protected int row;
    protected int col;
    protected int Arr[][];

    public Matrix(int row, int col)
    {
        this.row = row;
        this.col = col;
        Arr = new int[row][col];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter status of each seat :");

        for(int i = 0; i < this.row; i++)
        {
            for(int j = 0; j < this.col; j++)
            {
                Arr[i][j] = sobj.nextInt();
            
                if((Arr[i][j] != 0) && (Arr[i][j] != 1))
                {
                    System.out.println("You entered invalid seat status");
                    return;
                }
            }
        }

        System.out.println();

    }

    public void Display()
    {
        System.out.println("Cinema hall seat matrix : ");

        for(int i = 0; i < this.row; i++)
        {
            for(int j = 0; j < this.col; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println();
    }

}

class CinemaHall extends Matrix
{
    public CinemaHall(int row, int col)
    {
        super(row,col);
    }

    public int TotalBookedSeats()
    {
        int iCount = 0;

        for(int i = 0; i < super.row; i++)
        {
            for(int j = 0; j < super.col; j++)
            {
                if(Arr[i][j] == 1)
                {
                    iCount++;
                }
            }
        }

        return iCount;
    }

    public int MaximumBookingRow()
    {
        int RowWiseBookedSeats[] = new int[super.row];
        int MaxBooking = 0;
        int MaxBookedRow = 0;

        for(int i = 0; i < super.row; i++)
        {
            for(int j = 0; j < super.col; j++)
            {
                if(Arr[i][j] == 1)
                {
                    RowWiseBookedSeats[i] = RowWiseBookedSeats[i] + 1;
                }
            }
        }

        for(int i = 0; i < super.row; i++)
        {
            if(RowWiseBookedSeats[i] > MaxBooking)
            {
                MaxBooking = RowWiseBookedSeats[i];
                MaxBookedRow = i + 1;
            }
        }
        
        return MaxBookedRow;


    }

    public boolean CheckCompletelyFullRow()
    {
        int iCount = 0;
        boolean bFlag = false;

        for(int i = 0; i < super.row; i++)
        {
            for(int j = 0; j < super.col; j++)
            {
                if(Arr[i][j] == 1)
                {
                    iCount++;
                }
            }

            if(iCount == super.col)
            {
                bFlag = true;
            }

            iCount = 0;
        }

        return bFlag;
    }

}

class Assignment53_2
{
    public static void main(String A[])
    {
        int R = 0;
        int C = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows in cinema hall : ");
        R = sobj.nextInt();

        if(R <= 0)
        {
            System.out.println("You entered invalid number of rows");
        }

        System.out.println("Enter number of columns in cinema hall : ");
        C = sobj.nextInt();

        if(C <= 0)
        {
            System.out.println("You entered invalid number of columns");
        }

        CinemaHall cobj = new CinemaHall(R,C);

        cobj.Accept();
        cobj.Display();

        iRet = cobj.TotalBookedSeats();
        System.out.println("Total booked seats are : "+iRet);

        iRet = cobj.MaximumBookingRow();
        System.out.println("Row with Maximum booking : "+iRet);

        if(cobj.CheckCompletelyFullRow() == true)
        {
            System.out.println("Completely Full Row Exists : Yes");
        }
        else
        {
            System.out.println("Completely Full Row Exists : No");
        }

    }
}