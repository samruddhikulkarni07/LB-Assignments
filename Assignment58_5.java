//Write a program which accept matrix and swap the contents of consecutive rows

import java.util.Scanner;

class Matrix
{
    public void SwapRows(int Arr[][], int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        int temp[] = new int[iCol];

        for(i = 0; i+1 < iRow; i = i+2)
        {
            for(j = 0; j < iCol; j++)
            {
                temp[j] = Arr[i][j];
                Arr[i][j] = Arr[i+1][j];
                Arr[i+1][j] = temp[j];
            }
        }

        System.out.println("Matrix after swapping consecutive rows :");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
class Assignment58_5
{
    public static void main(String A[])
    {
        int iRow = 0;
        int iCol = 0;
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

        mobj.SwapRows(Arr,iRow,iCol);



    }

}