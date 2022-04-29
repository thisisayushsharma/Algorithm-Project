import java.util.*;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Tree {
    public static void main(String[] args) {

        //Building First Tree
        Vertex a1 = new Vertex("a");
        Vertex b1 = new Vertex("b");
        Vertex c1 = new Vertex("c");
        Vertex d1 = new Vertex("d");
        Vertex e1 = new Vertex("e");
        Vertex f1 = new Vertex("f");
        Vertex g1 = new Vertex("g");
        Vertex h1 = new Vertex("h");

        a1.addNeighbor(c1,5);
        c1.addNeighbor(e1,3);
        a1.addNeighbor(g1,7);
        a1.addNeighbor(b1,4);
        b1.addNeighbor(h1,8);
        b1.addNeighbor(d1,3);
        d1.addNeighbor(f1,9);

        LinkedList<Vertex> graph1= new LinkedList<Vertex>();
        graph1.add(a1); 
        graph1.add(b1); 
        graph1.add(c1); 
        graph1.add(d1); 
        graph1.add(e1); 
        graph1.add(f1); 
        graph1.add(g1); 
        graph1.add(h1); 

        //Second Tree

        Vertex a2 = new Vertex("a");
        Vertex b2 = new Vertex("b");
        Vertex c2 = new Vertex("c");
        Vertex d2 = new Vertex("d");
        Vertex e2 = new Vertex("e");
        Vertex f2 = new Vertex("f");
        Vertex g2 = new Vertex("g");
        Vertex h2 = new Vertex("h");

        a2.addNeighbor(c2,5);
        c2.addNeighbor(e2,3);
        a2.addNeighbor(g2,7);
        a2.addNeighbor(b2,4);
        b2.addNeighbor(h2,8);
        b2.addNeighbor(d2,3);
        d2.addNeighbor(f2,9);

        LinkedList<Vertex> graph2= new LinkedList<Vertex>();
        graph2.add(a2); 
        graph2.add(b2); 
        graph2.add(c2); 
        graph2.add(d2); 
        graph2.add(e2); 
        graph2.add(f2); 
        graph2.add(g2); 
        graph2.add(h2); 

        //Third Graph

        Vertex a3 = new Vertex("a");
        Vertex b3 = new Vertex("b");
        Vertex c3 = new Vertex("c");
        Vertex d3 = new Vertex("d");
        Vertex e3 = new Vertex("e");
        Vertex f3 = new Vertex("f");
        Vertex g3 = new Vertex("g");
        Vertex h3 = new Vertex("h");

        a3.addNeighbor(c3,5);
        c3.addNeighbor(e3,3);
        a3.addNeighbor(g3,7);
        a3.addNeighbor(b3,4);
        b3.addNeighbor(h3,8);
        b3.addNeighbor(d3,3);
        d3.addNeighbor(f3,9);

        LinkedList<Vertex> graph3= new LinkedList<Vertex>();
        graph3.add(a3); 
        graph3.add(b3); 
        graph3.add(c3); 
        graph3.add(d3); 
        graph3.add(e3); 
        graph3.add(f3); 
        graph3.add(g3); 
        graph3.add(h3); 

        //BFS
        BreadthFirstSearch bfs=new BreadthFirstSearch();
        long start1 = System.nanoTime();
        bfs.traverse(a1); 
        long end1 = System.nanoTime();
        
        NumberFormat formatter = new DecimalFormat("#0.0000");
        System.out.print("Execution time is " + formatter.format((end1 - start1) / 1000000d) +" "+ " milliseconds");

        System.out.println();

        //DFS
        DepthFirstSearch defs = new DepthFirstSearch();
        long start2 = System.nanoTime();
        defs.dfs(graph2); 
        long end2 = System.nanoTime();
        
        System.out.print("Execution time is " + formatter.format((end2 - start2) / 1000000d) +" " +" milliseconds");

        System.out.println();

        //Dijkstra
        long start3 = System.nanoTime();
        graph3 = Dijkstra.calculateShortestPathFromSource(graph3, a3);
        System.out.printf("The source node is: %s\n",a3.getName());
        
        for (Vertex i: graph3){
            System.out.printf("The distance from source node %s to %s is: %d\n",a3.getName(),i.getName(),i.getDistance());
        }
        long end3 = System.nanoTime();

        System.out.print("Execution time is " + formatter.format((end3 - start3) / 1000000d) +" "+ "milliseconds");
    }
}

