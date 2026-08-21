import java.util.*;

class Assignment52_2
{
    public static void main(String A[])
    {
        int N = 0;
        int VoterIDs[] = {0};

        Scanner sobj = new Scanner(System.in);
        ArrayList <Integer>  Valid = new ArrayList <Integer>();
        ArrayList <Integer>  Duplicate = new ArrayList <Integer>();

        System.out.println("Enter number of Votes : ");
        N = sobj.nextInt();

        VoterIDs = new int[N];

        System.out.println("Enter voter IDs : ");

        for(int i = 0; i < N; i++)
        {
            VoterIDs[i] = sobj.nextInt();
        }

        for(int i = 0; i < N; i++)
        {
            if(Valid.contains(VoterIDs[i]))
            {
                Duplicate.add(VoterIDs[i]);

            }
            else
            {
                Valid.add(VoterIDs[i]);
            }
        }

        System.out.println("Valid votes are : "+Valid.size());
        System.out.println("Rejected duplicate votes are : "+Duplicate.size());
        
        


    }
}