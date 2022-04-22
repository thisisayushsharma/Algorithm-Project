import java.util.*;

public class Vertex {
    final private String name;

    private boolean visited;
    private List<Vertex> neighbors;

    public Vertex(String name) {
        this.name = name;
        this.neighbors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited){
        this.visited = visited;
    }

    public List<Vertex> getNeighbors(){
        return neighbors;
    }

    public void addNeighbor(Vertex vertex){
        this.neighbors.add(vertex);
    }
    
}
