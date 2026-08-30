//Write a program which accept matrix and check whether the matrix is Sparse matrix or not.
// Sparse matrix is a matrix with the majority of its elements equals to zero

import java.util.Scanner;

class Matrix
{
    public boolean CheckSparse(int Arr[][], int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        int ZeroCount = 0;
        int OtherCount = 0;
        boolean bFlag = true;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == 0)
                {
                    ZeroCount++;
                }
                else
                {
                    OtherCount++;
                }
            }
        }

        if(OtherCount > ZeroCount)
        {
            bFlag = false;
        }

        return bFlag;
    }

}
class Assignment59_5
{
    public static void main(String A[])
    {
        int iRow = 0;
        int iCol = 0;
        int Arr[][] = null;
        boolean bRet = false;

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

        bRet = mobj.CheckSparse(Arr,iRow,iCol);

        if(bRet == true)
        {
            System.out.println("It is an Sparse matrix");
        }
        else
        {
            System.out.println("It is not an Sparse matrix");
        }



    }

}