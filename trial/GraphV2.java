//package de.vogella.algorithms.dijkstra.model;

import java.util.List;

public class GraphV2 {
    private final List<VertexV2> vertexes;
    private final List<EdgeV2> edges;

    public GraphV2(List<VertexV2> vertexes){
        this.vertexes = vertexes;
        this.edges=null;
    }

    public GraphV2(List<VertexV2> vertexes, List<EdgeV2> edges) {
        this.vertexes = vertexes;
        this.edges = edges;
    }

    public List<VertexV2> getVertexes() {
        return vertexes;
    }

    public List<EdgeV2> getEdges() {
        return edges;
    }



}