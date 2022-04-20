import java.io.*;
import java.util.*;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class TreeBFS {
    public static void main(String[] args) {
        int vertices = 8;
        VertexV2 a = new VertexV2("a","a");
        VertexV2 b = new VertexV2("b","b");
        VertexV2 c = new VertexV2("c","c");
        VertexV2 d = new VertexV2("d","d");
        VertexV2 e = new VertexV2("e","e");
        VertexV2 f = new VertexV2("f","f");
        VertexV2 g = new VertexV2("g","g");
        VertexV2 h = new VertexV2("h","h");

        a.addNeighbor(c);
        c.addNeighbor(e);
        a.addNeighbor(g);
        a.addNeighbor(b);
        b.addNeighbor(h);
        b.addNeighbor(d);
        d.addNeighbor(f);

        LinkedList<VertexV2> list= new LinkedList<VertexV2>();
        list.add(a); 
        list.add(b); 
        list.add(c); 
        list.add(d); 
        list.add(e); 
        list.add(f); 
        list.add(g); 
        list.add(h); 

        BreadthFirstSearch bfs=new BreadthFirstSearch();
        long start = System.currentTimeMillis();
        bfs.traverse(a); 
        long end = System.currentTimeMillis();
        
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");

}
}