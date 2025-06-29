package org.example.graphs;

import edu.uci.ics.jung.graph.SparseMultigraph;
import java.util.Collection;

public class JungAdapter<V, E> implements MyGraph<V, E> {

    private final SparseMultigraph<V, E> graph;

    public JungAdapter() {
        this.graph = new SparseMultigraph<>();
    }

    @Override
    public void addVertex(V vertex) {
        graph.addVertex(vertex);
    }

    @Override
    public void addEdge(E edge, V v1, V v2) {
        graph.addEdge(edge, v1, v2);
    }

    @Override
    public Collection<V> getNeighbors(V vertex) {
        return graph.getNeighbors(vertex);
    }
} 