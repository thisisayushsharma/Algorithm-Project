import java.util.*;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class EighteenEdgeGraph{
	public static void main(String[] args) {

		//first graph creation
		Vertex a = new Vertex("a");
        Vertex b = new Vertex("b");
        Vertex c = new Vertex("c");
        Vertex d = new Vertex("d");
        Vertex e = new Vertex("e");
        Vertex f = new Vertex("f");
        Vertex g = new Vertex("g");
        Vertex h = new Vertex("h");

        a.addNeighbor(c,5);
        c.addNeighbor(e,3);
        e.addNeighbor(g,7);
        g.addNeighbor(h,4);
        h.addNeighbor(f,8);
        f.addNeighbor(d,3);
        d.addNeighbor(b,9);
        b.addNeighbor(a,9);

        c.addNeighbor(f,5);
        d.addNeighbor(e,3);
        g.addNeighbor(a,7);
        b.addNeighbor(h,4);
        g.addNeighbor(d,8);
        h.addNeighbor(c,3);
        a.addNeighbor(h,9);
        b.addNeighbor(g,9);
        f.addNeighbor(e,9);
        d.addNeighbor(c,9);

        LinkedList<Vertex> list= new LinkedList<Vertex>();
        list.add(a); 
        list.add(b); 
        list.add(c); 
        list.add(d); 
        list.add(e); 
        list.add(f); 
        list.add(g); 
        list.add(h); 

        //second graph

        Vertex a2 = new Vertex("a2");
        Vertex b2 = new Vertex("b2");
        Vertex c2 = new Vertex("c2");
        Vertex d2 = new Vertex("d2");
        Vertex e2 = new Vertex("e2");
        Vertex f2 = new Vertex("f2");
        Vertex g2 = new Vertex("g2");
        Vertex h2 = new Vertex("h2");

        a2.addNeighbor(c2,5);
        c2.addNeighbor(e2,3);
        e2.addNeighbor(g2,7);
        g2.addNeighbor(h2,4);
        h2.addNeighbor(f2,8);
        f2.addNeighbor(d2,3);
        d2.addNeighbor(b2,9);
        b2.addNeighbor(a2,9);

        c2.addNeighbor(f2,5);
        d2.addNeighbor(e2,3);
        g2.addNeighbor(a2,7);
        b2.addNeighbor(h2,4);
        g2.addNeighbor(d2,8);
        h2.addNeighbor(c2,3);
        a2.addNeighbor(h2,9);
        b2.addNeighbor(g2,9);
        f2.addNeighbor(e2,9);
        d2.addNeighbor(c2,9);

        LinkedList<Vertex> list2= new LinkedList<Vertex>();
        list2.add(a2); 
        list2.add(b2); 
        list2.add(c2); 
        list2.add(d2); 
        list2.add(e2); 
        list2.add(f2); 
        list2.add(g2); 
        list2.add(h2); 

        //third graph

        Vertex a3 = new Vertex("a3");
        Vertex b3 = new Vertex("b3");
        Vertex c3 = new Vertex("c3");
        Vertex d3 = new Vertex("d3");
        Vertex e3 = new Vertex("e3");
        Vertex f3 = new Vertex("f3");
        Vertex g3 = new Vertex("g3");
        Vertex h3 = new Vertex("h3");

        a3.addNeighbor(c3,5);
        c3.addNeighbor(e3,3);
        e3.addNeighbor(g3,7);
        g3.addNeighbor(h3,4);
        h3.addNeighbor(f3,8);
        f3.addNeighbor(d3,3);
        d3.addNeighbor(b3,9);
        b3.addNeighbor(a3,9);

        c3.addNeighbor(f3,5);
        d3.addNeighbor(e3,3);
        g3.addNeighbor(a3,7);
        b3.addNeighbor(h3,4);
        g3.addNeighbor(d3,8);
        h3.addNeighbor(c3,3);
        a3.addNeighbor(h3,9);
        b3.addNeighbor(g3,9);
        f3.addNeighbor(e3,9);
        d3.addNeighbor(c3,9);

        LinkedList<Vertex> list3= new LinkedList<Vertex>();
        list3.add(a3); 
        list3.add(b3); 
        list3.add(c3); 
        list3.add(d3); 
        list3.add(e3); 
        list3.add(f3); 
        list3.add(g3); 
        list3.add(h3); 

        DepthFirstSearch defs = new DepthFirstSearch();
        long start = System.currentTimeMillis();
        defs.dfs(list); 
        long end = System.currentTimeMillis();
        
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");

        BreadthFirstSearch bfs=new BreadthFirstSearch();
        long start2 = System.currentTimeMillis();
        bfs.traverse(a); 
        long end2 = System.currentTimeMillis();

        System.out.print("Execution time is " + formatter.format((end2 - start2) / 1000d) + " seconds");

        //dijkstra
        long start3 = System.currentTimeMillis();
        list3 = Dijkstra.calculateShortestPathFromSource(list3,a3);
        System.out.printf("The source node is: %s\n", a3.getName());

        for(Vertex i: list3)
        {
            System.out.printf("The distance from the source node %s to %s is: %d\n", a3.getName(), i.getName(), i.getDistance());
        }
        long end3 = System.currentTimeMillis();

        System.out.print("Execution time for BFS is " + formatter.format((end3 - start3) / 1000d) + " seconds");
	}
}