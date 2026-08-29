//Write a program which accept matrix and display addition of elements from each column

import java.util.Scanner;

class Matrix
{
    public void AddColumn(int Arr[][], int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        int iSum = 0;

        for(i = 0; i < iCol; i++)
        {
            for(j = 0; j < iRow; j++)
            {
                iSum = iSum + Arr[j][i];
            }
            System.out.print(iSum+"\t");
            iSum = 0;

        }

    }

}
class Assignment58_4
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

        mobj.AddColumn(Arr,iRow,iCol);

    }

}