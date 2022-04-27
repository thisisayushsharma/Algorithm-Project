import java.util.*;
public class DijkstraTry {
    
    public static void main(String args[]){

        Vertex nodeA = new Vertex("A");
        Vertex nodeB = new Vertex("B");
        Vertex nodeC = new Vertex("C");
        Vertex nodeD = new Vertex("D"); 
        Vertex nodeE = new Vertex("E");
        Vertex nodeF = new Vertex("F");

        nodeA.addNeighbor(nodeB, 10);
        nodeA.addNeighbor(nodeC, 15);

        nodeB.addNeighbor(nodeD, 12);
        nodeB.addNeighbor(nodeF, 15);

        nodeC.addNeighbor(nodeE, 10);

        nodeD.addNeighbor(nodeE, 2);
        nodeD.addNeighbor(nodeF, 1);

        nodeF.addNeighbor(nodeE, 5);

        LinkedList<Vertex> list= new LinkedList<Vertex>();
        list.add(nodeA); 
        list.add(nodeB); 
        list.add(nodeC); 
        list.add(nodeD); 
        list.add(nodeE); 
        list.add(nodeF);
        list = Dijkstra.calculateShortestPathFromSource(list, nodeA);
        System.out.printf("The source node is: %s\n",nodeA.getName());
        
        for (Vertex i: list){
            System.out.printf("The distance from source node %s to %s is: %d\n",nodeA.getName(),i.getName(),i.getDistance());
        }
        
    }
}
