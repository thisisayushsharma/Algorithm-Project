import java.util.*;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class TwentyNodesCycle {
    public static void main(String[] args) {

        Random rand = new Random();
        int upperbound = 10;
        //Graph 1
        LinkedList<Vertex> list1= new LinkedList<Vertex>();
        for (int i=0;i<20;i++){
            String vertexName = String.format("%d",i);
            list1.add(new Vertex(vertexName));
        }

        for (int i=0;i<19;i++){
            list1.get(i).addNeighbor(list1.get(i+1),rand.nextInt(upperbound));
        }
        list1.get(19).addNeighbor(list1.get(0),rand.nextInt(upperbound));

        //Graph 2
        LinkedList<Vertex> list2= new LinkedList<Vertex>();
        for (int i=0;i<20;i++){
            String vertexName = String.format("%d",i);
            list2.add(new Vertex(vertexName));
        }

        for (int i=0;i<19;i++){
            list2.get(i).addNeighbor(list2.get(i+1),rand.nextInt(upperbound));
        }
        list2.get(19).addNeighbor(list2.get(0),rand.nextInt(upperbound));

        //Graph 3
        LinkedList<Vertex> list3= new LinkedList<Vertex>();
        for (int i=0;i<20;i++){
            String vertexName = String.format("%d",i);
            list3.add(new Vertex(vertexName));
        }

        for (int i=0;i<19;i++){
            list3.get(i).addNeighbor(list3.get(i+1),rand.nextInt(upperbound));
        }
        list3.get(19).addNeighbor(list3.get(0),rand.nextInt(upperbound));

        //BFS
        BreadthFirstSearch bfs=new BreadthFirstSearch();
        long start1 = System.nanoTime();
        bfs.traverse(list1.get(0)); 
        long end1 = System.nanoTime();
        
        NumberFormat formatter = new DecimalFormat("#0.0000");
        System.out.print("Execution time is " + formatter.format((end1 - start1) / 1000000d) +" "+ " milliseconds");

        System.out.println();

        //DFS
        DepthFirstSearch defs = new DepthFirstSearch();
        long start2 = System.nanoTime();
        defs.dfs(list2); 
        long end2 = System.nanoTime();
        
        System.out.print("Execution time is " + formatter.format((end2 - start2) / 1000000d) +" " +" milliseconds");

        System.out.println();

        //Dijkstra
        long start3 = System.nanoTime();
        list3 = Dijkstra.calculateShortestPathFromSource(list3, list3.get(0));
        System.out.printf("The source node is: %s\n",list3.get(0).getName());
        
        for (Vertex i: list3){
            System.out.printf("The distance from source node %s to %s is: %d\n",list3.get(0).getName(),i.getName(),i.getDistance());
        }
        long end3 = System.nanoTime();

        System.out.print("Execution time is " + formatter.format((end3 - start3) / 1000000d) +" "+ "milliseconds");
	}
}
        
