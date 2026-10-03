/*
Social Network Shortest Connection

A social networking application contains friendships:

Amit  -> Rahul, Pooja
Rahul -> Neha
Pooja -> Kiran
Neha  -> Riya
Kiran -> Riya

Find the minimum number of connections required to reach from:

Amit -> Riya

One possible path:

Amit -> Rahul -> Neha -> Riya

Number of connections:

3
*/

import java.util.*;

public class Assignment66_5
{
    public static void main(String[] args)
    {
        Map<String, List<String>> graph = new HashMap<>();

        graph.put("Amit", Arrays.asList("Rahul", "Pooja"));
        graph.put("Rahul", Arrays.asList("Neha"));
        graph.put("Pooja", Arrays.asList("Kiran"));
        graph.put("Neha", Arrays.asList("Riya"));
        graph.put("Kiran", Arrays.asList("Riya"));
        graph.put("Riya", new ArrayList<>());

        String start = "Amit";
        String target = "Riya";

        Queue<String> queue = new LinkedList<>();
        Map<String, Integer> distance = new HashMap<>();

        queue.add(start);
        distance.put(start, 0);

        while (!queue.isEmpty())
        {
            String current = queue.poll();

            if (current.equals(target))
            {
                break;
            }

            for (String friend : graph.get(current))
            {
                if (!distance.containsKey(friend))
                {
                    distance.put(friend, distance.get(current) + 1);
                    queue.add(friend);
                }
            }
        }

        System.out.println("Minimum number of connections from "
                + start + " to " + target + " = "
                + distance.get(target));
    }
}