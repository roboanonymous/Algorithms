package Searching;


import java.util.*;

public class BFS_Algorithm {

    private int V;
    private LinkedList<Integer> adj[];

    BFS_Algorithm(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }


    void addEdge(int v, int w) { adj[v].add(w); }
    void BFS(int s)
    {
        Queue <Integer> q = new LinkedList<>();
        boolean visited[]  = new boolean[V];

        visited[s] = true;
        q.add(s);

        while(!q.isEmpty())
        {
            s = q.poll();
            System.out.print(s+ " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    q.add(n);
                }

            }
        }
    }


    public static void main(String args[])
    {
        BFS_Algorithm g = new BFS_Algorithm(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println(
                "Following is Breadth First Traversal "
                        + "(starting from vertex 2)");

        g.BFS(2);
    }

}
