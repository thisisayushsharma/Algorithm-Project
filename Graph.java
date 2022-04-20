import java.util.LinkedList;

public class Graph {
    static class Edge {
    int source;
    int destination;
    int weight;

    public Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    }

    static class WGraph {
        int vertices;
        LinkedList<Edge> [] adjacencylist;

        WGraph(int vertices) {
            this.vertices = vertices;
            adjacencylist = new LinkedList[vertices];
            //initialize adjacency lists for all the vertices
            for (int i = 0; i <vertices ; i++) {
                adjacencylist[i] = new LinkedList<>();
            }
        }   
        public LinkedList<Edge> getAdjacencyList(int i){
            LinkedList<Edge> list = adjacencylist[i];
            return list;
        }

        public void addEgde(int source, int destination, int weight) {
            Edge edge = new Edge(source, destination, weight);
            adjacencylist[source].addFirst(edge); //for directed graph
        }

        public void printGraph(){
            for (int i = 0; i <vertices ; i++) {
                LinkedList<Edge> list = adjacencylist[i];
                for (int j = 0; j <list.size() ; j++) {
                    System.out.println("vertex-" + i + " is connected to " +
                    list.get(j).destination + " with weight " + list.get(j).weight);
                }
            }
        }
    }
}

