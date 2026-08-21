import java.util.*;

class VotingSystem
{
    private int N;
    private int VoterIDs[];

    ArrayList <Integer>  Valid = new ArrayList <Integer>();
    ArrayList <Integer>  Duplicate = new ArrayList <Integer>();

    public void AcceptVoterIDs()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of Votes : ");
        N = sobj.nextInt();

        VoterIDs = new int[N];

        System.out.println("Enter voter IDs : ");

        for(int i = 0; i < N; i++)
        {
            VoterIDs[i] = sobj.nextInt();
        }

    
    }

    public void ProcessVotes()
    {
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

    }

    public void DisplayResult()
    {
        System.out.println("Valid votes are : "+Valid.size());
        System.out.println("Rejected duplicate votes are : "+Duplicate.size());
    }

}

class Assignment52_3
{
    public static void main(String A[])
    {
        
        VotingSystem vobj = new VotingSystem();

        vobj.AcceptVoterIDs();

        vobj.ProcessVotes();

        vobj.DisplayResult();


    }
}