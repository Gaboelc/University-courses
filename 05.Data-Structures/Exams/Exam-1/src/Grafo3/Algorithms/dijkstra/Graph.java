package Grafo3.Algorithms.dijkstra;

import java.util.HashSet;
import java.util.Set;

public class Graph {

    private Set<MyNodesNode> nodes = new HashSet<>();

    public void addNode(MyNodesNode nodeA) {
        nodes.add(nodeA);
    }

    public Set<MyNodesNode> getNodes() {
        return nodes;
    }

    public void setNodes(Set<MyNodesNode> nodes) {
        this.nodes = nodes;
    }
}
