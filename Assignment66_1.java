/*
Find Two Transactions Matching a Target

A customer made transactions:

1200 500 700 300 1500

Find whether two transactions have a combined value of:

2000

Output:

500 + 1500 = 2000
*/

class Assignment66_1
{
    public static void main(String A[])
    {
        int Arr[] = {1200,500,700,300,1500};
        boolean bFlag = false;

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = i+1; j < Arr.length; j++)
            {
                if(Arr[i] + Arr[j] == 2000)
                {
                    System.out.println(Arr[i]+" + "+Arr[j]+" = "+2000);
                    bFlag = true;
                    break;

                }
            }
        }

        if(bFlag == false)
        {
            System.out.println("Target matching two transactions not found");
        }
    }
}