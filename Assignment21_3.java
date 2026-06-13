// Write a program to display all factors of a given number

class Logic
{
    void DisplayFactors(int num)  
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= (num /2); iCnt++)
        {
            if((num % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
        

    }

}

class Assignment21_3

{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.DisplayFactors(12);
    }
}