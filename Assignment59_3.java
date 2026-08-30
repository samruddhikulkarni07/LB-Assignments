//Write a program which accept matrix and reverse the contents of each column
// Input :
// 1 2 3
// 4 5 6
// 7 8 9

// Output :
// 7 8 9
// 4 5 6
// 1 2 3

import java.util.Scanner;

class Matrix
{
    public void ReverseCol(int Arr[][], int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        int temp = 0;

       
        for(i = 0; i < iCol; i++)
        {
            for(j = 0; j < iRow/2; j++)
            {
                temp = Arr[j][i];
                Arr[j][i] = Arr[iRow-1-j][i];
                Arr[iRow-1-j][i] = temp;
            
            }
        }

        System.out.println("Updated of matrix is :");

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
class Assignment59_3
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

        mobj.ReverseCol(Arr,iRow,iCol);



    }

}