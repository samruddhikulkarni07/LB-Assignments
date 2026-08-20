import java.util.*;

class Cinema
{
    private int rows;
    private int cols;
    private boolean CinemaHallSeats[][];
    private int rowWisePrice[];

    public Cinema(int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;
        this.CinemaHallSeats = new boolean[rows][cols];
        this.rowWisePrice = new int[rows];

        for(int i = 0; i < rowWisePrice.length; i++)
        {
            rowWisePrice[i] = 100 + (i * 50);
        }
    }

    public void MarkAlreadyBookedSeats(int bookedSeatList[][])
    {
        for(int i = 0; i < bookedSeatList.length; i++)
        {
            int row = bookedSeatList[i][0];
            int column = bookedSeatList[i][1];
            CinemaHallSeats[row][column] = true;
        }
        
    }

    public boolean CheckValidityOfSeats(int requestedSeatList[][])
    {
        boolean bFlag = true;

        for(int i = 0; i < requestedSeatList.length; i++)
        {
            int row = requestedSeatList[i][0];
            int column = requestedSeatList[i][1];

            if(CinemaHallSeats[row][column] == true)
            {
                bFlag = false;
            }
        }

        return bFlag;
    }

    public void BookSeats(int requestedSeatList[][])
    {
        for(int i = 0; i < requestedSeatList.length; i++)
        {
            int row = requestedSeatList[i][0];
            int column = requestedSeatList[i][1];

            CinemaHallSeats[row][column] = true;
        }
    }

    public int CostCalculation(int requestedSeatList[][])
    {
        int totalCost = 0;

        for(int i = 0; i < requestedSeatList.length; i++)
        {
            int row = requestedSeatList[i][0];
    
            totalCost = totalCost + rowWisePrice[row];
        }

        if(requestedSeatList.length >= 6)
        {
            totalCost = totalCost - ((totalCost * 10) / 100);
        }

        return totalCost;

    }

    public int RemainingSeats()
    {
        int countRemaining = 0;

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(CinemaHallSeats[i][j] == false)
                {
                    countRemaining++;
                }
            }
        }

        return countRemaining;
    }

   
}

class Assignment51_5
{
    public static void main(String A[])
    {
        int rows = 0;
        int cols = 0;
        int CountOfBookedSeats = 0;
        int CountOfRequestedSeats = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("How many rows are available in Cinema hall : ");
        rows = sobj.nextInt();

        System.out.println("How many columns are available in each row of Cinema hall : ");
        cols = sobj.nextInt();


        Cinema cobj = new Cinema(rows, cols);


        System.out.println("How many seats are already booked : ");
        CountOfBookedSeats = sobj.nextInt();

        int bookedSeatList[][] = new int[CountOfBookedSeats][2];        // there are multiple seats are booked , but for every seat we store row & column

        System.out.println("Enter row and column of booked seats : ");

        for(int i = 0; i < bookedSeatList.length; i++)
        {
            System.out.println("Enter row and column of booked seats "+(i + 1)+ " : ");
            bookedSeatList[i][0] = sobj.nextInt();          //row
            bookedSeatList[i][1] = sobj.nextInt();          //column
            
        }

        System.out.println();

        System.out.println("How many seats user want to book : ");
        CountOfRequestedSeats = sobj.nextInt();

        int requestedSeatList[][] = new int[CountOfRequestedSeats][2];

        System.out.println("Enter rows and columns of seats that user want to book : ");

        for(int i = 0; i < requestedSeatList.length; i++)
        {
            System.out.println("Enter row and column of "+(i + 1)+" seats : ");
            requestedSeatList[i][0] = sobj.nextInt();
            requestedSeatList[i][1] = sobj.nextInt();

        }

        cobj.MarkAlreadyBookedSeats(bookedSeatList);

        boolean Valid = cobj.CheckValidityOfSeats(requestedSeatList);

        if(Valid == true)
        {
            cobj.BookSeats(requestedSeatList);
            System.out.println("Seats are booked successsdully");

            int cost = cobj.CostCalculation(requestedSeatList);
            System.out.println("Total cost is : "+cost);

            int remaining = cobj.RemainingSeats();
            System.out.println("Total remaining seats are : "+remaining);


        }
        else
        {
            System.out.println("Unable to book seats because 1 or more seats are them already booked");
        }



        
        
    }
}