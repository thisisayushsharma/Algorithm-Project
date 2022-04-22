//package de.vogella.algorithms.dijkstra.model;

public class EdgeV2 {
    private final String id;
    private final VertexV2 source;
    private final VertexV2 destination;
    private final int weight;

    public EdgeV2(String id, VertexV2 source, VertexV2 destination, int weight) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }
    public VertexV2 getDestination() {
        return destination;
    }

    public VertexV2 getSource() {
        return source;
    }
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return source + " " + destination;
    }


}