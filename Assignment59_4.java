//Write a program which accept matrix and check whether the matrix is identity matrix or not.
// Identity matrix is a square matrix with 1's along the diagonal from upper left to lower right
//and 0's in all other position.
// ex
// 1 0 0 0
// 0 1 0 0
// 0 0 1 0
// 0 0 0 1

import java.util.Scanner;

class Matrix
{
    public boolean CheckIdentity(int Arr[][], int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        boolean bFlag = true;

        if(iRow != iCol)
        {
            return false;
        }

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if((i == j && Arr[i][j] != 1) || (i != j && Arr[i][j] != 0))
                {
                    bFlag = false;
                }
            }
        }

        return bFlag;
    }

}
class Assignment59_4
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

        bRet = mobj.CheckIdentity(Arr,iRow,iCol);

        if(bRet == true)
        {
            System.out.println("It is an identity matrix");
        }
        else
        {
            System.out.println("It is not an identity matrix");
        }



    }

}