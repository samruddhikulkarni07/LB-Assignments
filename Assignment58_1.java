//Write a program which accept matrix from user and return addition of diagonal elements

import java.util.Scanner;

class Matrix
{
    public int AddDiagonal(int Arr[][], int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        int iSum = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(i == j)
                {
                    iSum = iSum + Arr[i][j];
                }
            }
        }

        return iSum;
    }

}
class Assignment58_1
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

        iRet = mobj.AddDiagonal(Arr,iRow,iCol);

        System.out.println("Addition of diagonal elements : "+iRet);


    }

}