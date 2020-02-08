/*NAME          :SWAPNA MUKKAMALLA
  DATE          :11-06-2019
  COURSE        :IT-516 DATA STRUCTURES AND ALGORITHMS
  HOMEWORK      :HW08
  TITLE         : Tester client for Dijkstra's SP algorithm
 DESCRIPTION    :This application accepts text file name and
                 integer vertex from which we want to check the shortest paths.
                 reads the edge-weighted digraph from the input
                 stream, computes the Dijkstra SP of that digraph for the source,
                 and prints the shortest path from the source to each of the other

 */

import edu.princeton.cs.algs4.*;

public class DijkstraTester {

    public static void main(String[] args) {
        EdgeWeightedDigraph G;
        G = new EdgeWeightedDigraph(new In(args[0]));    // input stream  reads the egde weighted di graph
        int s = Integer.parseInt(args[1]);               // reading source vertex
        DijkstraSP sp = new DijkstraSP(G, s);            //Using Dijkstra SP class


        // printing the shortest path from source vertex to each of the vertices
        for (int i = 0; i < G.V(); i++) {
            StdOut.print(s + " to " + i);
            StdOut.printf(" (%4.2f): ", sp.distTo(i));      //
            if (sp.hasPathTo(i))
                for (DirectedEdge e : sp.pathTo(i))
                    StdOut.print(e + " ");
            StdOut.println();
        }

    }
}
