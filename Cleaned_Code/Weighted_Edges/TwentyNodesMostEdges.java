import java.util.*;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class TwentyNodesMostEdges {
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
        list1.get(0).addNeighbor(list1.get(5),rand.nextInt(upperbound));
        list1.get(2).addNeighbor(list1.get(7),rand.nextInt(upperbound));
        list1.get(4).addNeighbor(list1.get(9),rand.nextInt(upperbound));
        list1.get(8).addNeighbor(list1.get(12),rand.nextInt(upperbound));
        list1.get(9).addNeighbor(list1.get(14),rand.nextInt(upperbound));
        list1.get(2).addNeighbor(list1.get(6),rand.nextInt(upperbound));
        list1.get(1).addNeighbor(list1.get(0),rand.nextInt(upperbound));
        list1.get(17).addNeighbor(list1.get(19),rand.nextInt(upperbound));
        list1.get(15).addNeighbor(list1.get(18),rand.nextInt(upperbound));

        list1.get(2).addNeighbor(list1.get(4),rand.nextInt(upperbound));
        list1.get(3).addNeighbor(list1.get(6),rand.nextInt(upperbound));
        list1.get(1).addNeighbor(list1.get(8),rand.nextInt(upperbound));
        list1.get(7).addNeighbor(list1.get(17),rand.nextInt(upperbound));
        list1.get(9).addNeighbor(list1.get(11),rand.nextInt(upperbound));
        list1.get(10).addNeighbor(list1.get(15),rand.nextInt(upperbound));
        list1.get(4).addNeighbor(list1.get(18),rand.nextInt(upperbound));
        list1.get(7).addNeighbor(list1.get(10),rand.nextInt(upperbound));
        list1.get(9).addNeighbor(list1.get(16),rand.nextInt(upperbound));
        list1.get(1).addNeighbor(list1.get(5),rand.nextInt(upperbound));
        

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
        list2.get(0).addNeighbor(list2.get(5),rand.nextInt(upperbound));
        list2.get(2).addNeighbor(list2.get(7),rand.nextInt(upperbound));
        list2.get(4).addNeighbor(list2.get(9),rand.nextInt(upperbound));
        list2.get(8).addNeighbor(list2.get(12),rand.nextInt(upperbound));
        list2.get(9).addNeighbor(list2.get(14),rand.nextInt(upperbound));
        list2.get(2).addNeighbor(list2.get(6),rand.nextInt(upperbound));
        list2.get(1).addNeighbor(list2.get(0),rand.nextInt(upperbound));
        list2.get(17).addNeighbor(list2.get(19),rand.nextInt(upperbound));
        list2.get(15).addNeighbor(list2.get(18),rand.nextInt(upperbound));

        list2.get(2).addNeighbor(list2.get(4),rand.nextInt(upperbound));
        list2.get(3).addNeighbor(list2.get(6),rand.nextInt(upperbound));
        list2.get(1).addNeighbor(list2.get(8),rand.nextInt(upperbound));
        list2.get(7).addNeighbor(list2.get(17),rand.nextInt(upperbound));
        list2.get(9).addNeighbor(list2.get(11),rand.nextInt(upperbound));
        list2.get(10).addNeighbor(list2.get(15),rand.nextInt(upperbound));
        list2.get(4).addNeighbor(list2.get(18),rand.nextInt(upperbound));
        list2.get(7).addNeighbor(list2.get(10),rand.nextInt(upperbound));
        list2.get(9).addNeighbor(list2.get(16),rand.nextInt(upperbound));
        list2.get(1).addNeighbor(list2.get(5),rand.nextInt(upperbound));

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
        list3.get(0).addNeighbor(list3.get(5),rand.nextInt(upperbound));
        list3.get(2).addNeighbor(list3.get(7),rand.nextInt(upperbound));
        list3.get(4).addNeighbor(list3.get(9),rand.nextInt(upperbound));
        list3.get(8).addNeighbor(list3.get(12),rand.nextInt(upperbound));
        list3.get(9).addNeighbor(list3.get(14),rand.nextInt(upperbound));
        list3.get(2).addNeighbor(list3.get(6),rand.nextInt(upperbound));
        list3.get(1).addNeighbor(list3.get(0),rand.nextInt(upperbound));
        list3.get(17).addNeighbor(list3.get(19),rand.nextInt(upperbound));
        list3.get(15).addNeighbor(list3.get(18),rand.nextInt(upperbound));

        list3.get(2).addNeighbor(list3.get(4),rand.nextInt(upperbound));
        list3.get(3).addNeighbor(list3.get(6),rand.nextInt(upperbound));
        list3.get(1).addNeighbor(list3.get(8),rand.nextInt(upperbound));
        list3.get(7).addNeighbor(list3.get(17),rand.nextInt(upperbound));
        list3.get(9).addNeighbor(list3.get(11),rand.nextInt(upperbound));
        list3.get(10).addNeighbor(list3.get(15),rand.nextInt(upperbound));
        list3.get(4).addNeighbor(list3.get(18),rand.nextInt(upperbound));
        list3.get(7).addNeighbor(list3.get(10),rand.nextInt(upperbound));
        list3.get(9).addNeighbor(list3.get(16),rand.nextInt(upperbound));
        list3.get(1).addNeighbor(list3.get(5),rand.nextInt(upperbound));

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
