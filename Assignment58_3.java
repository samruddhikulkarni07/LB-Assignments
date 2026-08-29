//Write a program which accept matrix and return largest number from both the diagonals

import java.util.Scanner;

class Matrix
{
    public int MaxDiagonal(int Arr[][], int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        int iMax = Arr[0][0];

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(i == j || i+j == iCol-1)
                {
                    if(Arr[i][j] > iMax)
                    {
                        iMax = Arr[i][j];
                    }
                }
            }
        }

        return iMax;
    }

}
class Assignment58_3
{
    public static void main(String A[])
    {
        int iRow = 0;
        int iCol = 0;
        int iRet = 0;
        int Arr[][] = null;

        Scanner sobj = new Scanner(System.in);
        Matrix mobj = new Matrix();

        System.out.println("Enter number of Rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iCol = sobj.nextInt();

        Arr = new int[iRow][iCol];

        System.out.println("Enter elements of the matrix : ");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        iRet = mobj.MaxDiagonal(Arr,iRow,iCol);

        System.out.println("Largest number from both diagonal is : "+iRet);


    }

}