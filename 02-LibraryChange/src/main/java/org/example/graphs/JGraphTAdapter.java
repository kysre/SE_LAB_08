package org.example.graphs;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultUndirectedGraph;
import org.jgrapht.Graphs;

import java.util.Collection;

public class JGraphTAdapter<V, E> implements MyGraph<V, E> {

    private final Graph<V, E> graph;

    public JGraphTAdapter(Class<? extends E> edgeClass) {
        this.graph = new DefaultUndirectedGraph<>(edgeClass);
    }

    @Override
    public void addVertex(V vertex) {
        graph.addVertex(vertex);
    }

    @Override
    public void addEdge(E edge, V v1, V v2) {
        graph.addEdge(v1, v2, edge);
    }

    @Override
    public Collection<V> getNeighbors(V vertex) {
        return Graphs.neighborListOf(graph, vertex);
    }
} 