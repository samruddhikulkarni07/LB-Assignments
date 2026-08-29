//Write a program which accept matrix and one number from user and return 
// frequency of that number

import java.util.Scanner;

class Matrix
{
    public int Frequency(int Arr[][], int iRow, int iCol, int iNo)
    {
        int i = 0;
        int j = 0;
        int iCount = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == iNo)
                {
                    iCount++;
                }
            }
        }

        return iCount;
    }

}
class Assignment58_2
{
    public static void main(String A[])
    {
        int iRow = 0;
        int iCol = 0;
        int iRet = 0;
        int iNo = 0;
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

        System.out.println("Enter number to find frequency : ");
        iNo = sobj.nextInt();

        iRet = mobj.Frequency(Arr,iRow,iCol,iNo);

        System.out.println("Frequency is : "+iRet);


    }

}