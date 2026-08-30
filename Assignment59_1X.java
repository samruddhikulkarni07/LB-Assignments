//Write a program which accept matrix and display transpose of the matrix
//the transpose of a given matrix is formedby interchanging the rows and columns of a matrix

import java.util.Scanner;

class Matrix
{
    public void Transpose(int Arr[][], int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        int temp = 0;

        if(iCol != iRow)
        {
            return;
        }

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(i < j)
                {
                    temp = Arr[i][j];
                    Arr[i][j] = Arr[j][i];
                    Arr[j][i] = temp; 
                }
            }
        }

        System.out.println("Transpose of matrix is :");

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
class Assignment59_1X
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

        mobj.Transpose(Arr,iRow,iCol);



    }

}