package Graphs;

import java.util.*;

class BFS {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Read the number of nodes
        int n = scn.nextInt();

        // Read the number of edges
        int m = scn.nextInt();

        // Initialize the adjacency list for the graph
        ArrayList<Integer>[] G = new ArrayList[n + 1]; // 1-based indexing

        for (int i = 0; i <= n; i++) {
            G[i] = new ArrayList<Integer>();
        }

        // Read the edges of the graph
        for (int i = 0; i < m; i++) {
            int u = scn.nextInt();
            int v = scn.nextInt();
            G[u].add(v);
            G[v].add(u);
        }

        // Read the source node
        int source = scn.nextInt();

        // Queue for BFS
        Queue<Integer> q = new LinkedList<>();

        // Visited array to keep track of visited nodes
        boolean[] visited = new boolean[n + 1];
        int[] level = new int[n+1];
        level[source] = 0;

        // Start BFS from the source node
        visited[source] = true;
        q.add(source);

        // BFS loop
        while (!q.isEmpty()) {
            int front = q.poll(); // Get the front element of the queue
            System.out.print(front + " "); // Print the node

            // Traverse all the neighbors of the current node
            for (int neighbour : G[front]) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.add(neighbour); // Add unvisited neighbors to the queue
                    level[neighbour] = level[front] + 1; 
                }
            }
        }

        System.out.println(level.toString());

        scn.close(); // Close the scanner
    }
}
