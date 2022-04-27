import java.util.*;
public class Dijkstra{

    public static LinkedList<Vertex> calculateShortestPathFromSource(LinkedList<Vertex> graph, Vertex source) {
        source.setDistance(0);
    
        Set<Vertex> settledNodes = new HashSet<>();
        Set<Vertex> unsettledNodes = new HashSet<>();
    
        unsettledNodes.add(source);
    
        while (unsettledNodes.size() != 0) {
            Vertex currentNode = getLowestDistanceNode(unsettledNodes);
            unsettledNodes.remove(currentNode);
            for (Map.Entry < Vertex, Integer> adjacencyPair : currentNode.getNeighbors().entrySet()) {
                Vertex adjacentNode = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();
                if (!settledNodes.contains(adjacentNode)) {
                    calculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            }
            settledNodes.add(currentNode);
        }
        return graph;
    }
    private static Vertex getLowestDistanceNode(Set < Vertex > unsettledNodes) {
        Vertex lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Vertex node: unsettledNodes) {
            int nodeDistance = node.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }

    private static void calculateMinimumDistance(Vertex evaluationNode,Integer edgeWeigh, Vertex sourceNode) {
        Integer sourceDistance = sourceNode.getDistance();
        if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
            evaluationNode.setDistance(sourceDistance + edgeWeigh);
            LinkedList<Vertex> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            evaluationNode.setShortestPath(shortestPath);
        }
    }
}
      




        //Map<Vertex,Integer>  map = source.getNeighbors();
        //Set<Vertex> v = map.keySet();
            
      //  function dijkstra(G, S)
    //for each vertex V in G
        //distance[V] <- infinite
        //previous[V] <- NULL
      //  If V != S, add V to Priority Queue Q
    //distance[S] <- 0
	
    //while Q IS NOT EMPTY
       // U <- Extract MIN from Q
      //  for each unvisited neighbour V of U
            //tempDistance <- distance[U] + edge_weight(U, V)
            //if tempDistance < distance[V]
             //   distance[V] <- tempDistance
           //     previous[V] <- U
    // return distance[], previous[]

