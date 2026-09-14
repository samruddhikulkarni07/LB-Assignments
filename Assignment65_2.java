/*
2. Customers submit support requests:

R101
R102
R103
R104

Requests must normally be handled in the same order in which they arrive.

Implement:

addRequest()
processRequest()
showPendingRequests()
*/

import java.util.*;

class Assignment65_2
{

    public static void main(String A[])
    {
        
        Queue<String> requests = new LinkedList<String>();

        // Add request
        requests.add("R101");
        requests.add("R102");
        requests.add("R103");
        requests.add("R104");

        while(requests.size() != 0)
        {   
            // Show pending request
            System.out.print("Pending requests : ");

            for(String str : requests)
            {
                System.out.print(str+"\t");
            }

            System.out.println();

            // Process request
            requests.remove();

            

        }


        
    }
}