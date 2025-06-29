package org.example.graphs;

import java.util.Collection;

public interface MyGraph<V, E> {
    void addVertex(V vertex);
    void addEdge(E edge, V v1, V v2);
    Collection<V> getNeighbors(V vertex);
} 