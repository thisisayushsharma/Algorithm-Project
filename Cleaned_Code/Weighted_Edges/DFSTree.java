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

        a.addNeighbor(c,5);
        c.addNeighbor(e,3);
        a.addNeighbor(g,7);
        a.addNeighbor(b,4);
        b.addNeighbor(h,8);
        b.addNeighbor(d,3);
        d.addNeighbor(f,9);

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
