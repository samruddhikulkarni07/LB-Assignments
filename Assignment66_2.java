/*
Longest Consecutive Employee ID Sequence

Given IDs:

100
4
200
1
3
2
5

Find the longest consecutive sequence.

Output:

1 2 3 4 5

Length : 5
*/


import java.util.*;

class Assignment66_2
{
    public static void main(String A[])
    {
        int Arr[] = {100,4,200,1,3,2,5};

        HashSet<Integer> hobj = new HashSet<Integer>();

        for(int val : Arr)
        {
            hobj.add(val);
        }

        int LongestConsecutiveStart = 0;
        int LongestLength = 0;

        for(int id : hobj)
        {
            if(hobj.contains(id - 1) == false)
            {
                int CurrentId = id;
                int CurrentLength = 1;

                while(hobj.contains(CurrentId+1))
                {
                    CurrentLength++;
                    CurrentId = CurrentId + 1;
                }

                if(CurrentLength > LongestLength)
                {
                    LongestConsecutiveStart = id;
                    LongestLength = CurrentLength;
                }
            }
        }

        for(int i = 0; i < LongestLength; i++)
        {
            System.out.print(LongestConsecutiveStart+i+" ");
        }
        System.out.println();
        System.out.println("Length : "+LongestLength);
    }
}