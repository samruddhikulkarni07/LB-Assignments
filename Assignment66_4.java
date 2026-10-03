/*
4. Software Dependency Resolver

A software project has dependencies:

Database -> Backend
Backend  -> API
API      -> Frontend

Determine a valid order in which modules should be initialized.

Expected:

Database
Backend
API
Frontend

For a more complex input:

A -> C
B -> C
C -> D
B -> E
D -> F
E -> F

find a valid dependency order.

*/

import java.util.*;

public class Assignment66_4 
{
    public static void addEdge(List<List<Integer>> graph,
                        int[] indegree,
                        int from,
                        int to) {

        graph.get(from).add(to);
        indegree[to]++;
    }

    public static void main(String A[]) {

        // Dependencies:
        // A -> C
        // B -> C
        // C -> D
        // B -> E
        // D -> F
        // E -> F

        int n = 6;

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        int[] indegree = new int[n];

        // A=0, B=1, C=2, D=3, E=4, F=5

        addEdge(graph, indegree, 0, 2); // A -> C
        addEdge(graph, indegree, 1, 2); // B -> C
        addEdge(graph, indegree, 2, 3); // C -> D
        addEdge(graph, indegree, 1, 4); // B -> E
        addEdge(graph, indegree, 3, 5); // D -> F
        addEdge(graph, indegree, 4, 5); // E -> F

        Queue<Integer> queue = new LinkedList<>();

        // Add nodes having no dependency
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        System.out.println("Valid Dependency Order:");

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print((char) ('A' + current) + " ");

            for (int next : graph.get(current)) {

                indegree[next]--;

                if (indegree[next] == 0) {
                    queue.add(next);
                }
            }
        }
    }

    
}