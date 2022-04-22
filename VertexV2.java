package de.vogella.algorithms.dijkstra.model;

public class VertexV2 {
    final private String id;
    final private String name;

    private boolean visited;
    private List<Vertex> adjacencyList;


    public Vertex(String id, String name) {
        this.id = id;
        this.name = name;
        this.adjacencyList = new ArrayList<>();


    }
    public String getId() {
        return id;
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

    public List<Vertex> getAdjacencyList(){
        return adjacencyList;
    }

    public void addNeighbor(Vertex vertex){
        this.adjacencyList.add(vertex);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vertex other = (Vertex) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return name;
    }

}