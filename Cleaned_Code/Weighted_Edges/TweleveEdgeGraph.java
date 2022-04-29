import java.util.*;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class TweleveEdgeGraph{
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

        LinkedList<Vertex> list2= new LinkedList<Vertex>();
        list.add(a2); 
        list.add(b2); 
        list.add(c2); 
        list.add(d2); 
        list.add(e2); 
        list.add(f2); 
        list.add(g2); 
        list.add(h2); 

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

        LinkedList<Vertex> list3= new LinkedList<Vertex>();
        list.add(a3); 
        list.add(b3); 
        list.add(c3); 
        list.add(d3); 
        list.add(e3); 
        list.add(f3); 
        list.add(g3); 
        list.add(h3); 

        DepthFirstSearch defs = new DepthFirstSearch();
        long start = System.currentTimeMillis();
        defs.dfs(list); 
        long end = System.currentTimeMillis();
        
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");

        BreadthFirstSearch bfs=new BreadthFirstSearch();
        long start = System.currentTimeMillis();
        bfs.traverse(a2); 
        long end = System.currentTimeMillis();

        System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");

        long start = System.currentTimeMillis();
        list3 = Dijkstra.calculateShortestPathFromSource(list3,a3);
        System.out.println("The source node is: %s\n", a3.getName());

        for(Vertex i: list3)
        {
            System.out.println("The distance from the source node %s to %s is: %d\n", a3.getName(), i.getName(), i.getDistance());
        }
        long end = System.currentTimeMillis();

        System.out.print("Execution time for BFS is " + formatter.format((end - start) / 1000d) + " seconds");
	}
}