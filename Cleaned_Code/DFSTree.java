import java.util.*;
import java.text.NumberFormat;
import java.text.DecimalFormat;
public class DFSTree {
    public static void main(String[] args) {
        Vertex a = new Vertex("a");
        Vertex b = new Vertex("b");
        Vertex c = new Vertex("c");
        Vertex d = new Vertex("d");
        Vertex e = new Vertex("e");
        Vertex f = new Vertex("f");
        Vertex g = new Vertex("g");
        Vertex h = new Vertex("h");

        a.addNeighbor(c);
        c.addNeighbor(e);
        a.addNeighbor(g);
        a.addNeighbor(b);
        b.addNeighbor(h);
        b.addNeighbor(d);
        d.addNeighbor(f);

        LinkedList<Vertex> list= new LinkedList<Vertex>();
        list.add(a); 
        list.add(b); 
        list.add(c); 
        list.add(d); 
        list.add(e); 
        list.add(f); 
        list.add(g); 
        list.add(h); 

        DepthFirstSearch defs = new DepthFirstSearch();
        long start = System.currentTimeMillis();
        defs.dfs(list); 
        long end = System.currentTimeMillis();
        
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");

    }
}
