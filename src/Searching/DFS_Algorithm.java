package Searching;

import java.util.*;

public class DFS_Algorithm {

    private int V;
    private LinkedList<Integer> adj[];

    DFS_Algorithm(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }


    void addEdge(int v, int w) { adj[v].add(w); }
    void DFS(int s)
    {
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[V];
        stack.push(s);
        visited[s] = true;

        while (!stack.isEmpty())
        {
            s = stack.pop();
            System.out.print(s+ " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if(!visited[n])
                {
                    visited[n] = true;
                    stack.push(n);

                }
            }
        }

    }


    public static void main(String args[])
    {
        DFS_Algorithm g = new DFS_Algorithm(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 2)");

        g.DFS(2);
    }

}
