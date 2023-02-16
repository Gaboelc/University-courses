package Grafo3.Algorithms.dijkstra;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class MyNodesNode {

    private String name;

    private LinkedList<MyNodesNode> shortestPath = new LinkedList<>();

    private Integer distance = Integer.MAX_VALUE;

    private Map<MyNodesNode, Integer> adjacentNodes = new HashMap<>();

    public MyNodesNode(String name) {
        this.name = name;
    }

    public void addDestination(MyNodesNode destination, int distance) {
        adjacentNodes.put(destination, distance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<MyNodesNode, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setAdjacentNodes(Map<MyNodesNode, Integer> adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public List<MyNodesNode> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(LinkedList<MyNodesNode> shortestPath) {
        this.shortestPath = shortestPath;
    }

}
