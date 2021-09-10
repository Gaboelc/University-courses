package Grafo3.Algorithms.dijkstra;
/*
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;
*/

public class Dijkstra {
    
    public static void dijkstra(){
        
        int[][] adjacencyMatrix = {
            {0,2,4,0,0,3,0,0},
            {0,0,0,1,0,0,2,0},
            {0,0,0,0,1,0,0,0},
            {0,0,0,0,0,3,0,0},
            {0,0,0,0,0,2,0,0},
            {0,0,0,0,0,0,0,4},
            {0,0,0,0,0,5,0,5},
            {0,0,0,0,0,0,0,0}
        };
        
        int v = adjacencyMatrix.length;
        boolean visited[] = new boolean[v];
        int distance[] = new int[v];
        distance[0] = 0;
        
        for(int i = 1; i < v; i++){
            distance[i] = Integer.MAX_VALUE;
        }
        for(int i = 0; i < v-1; i++){
            int minVertex = findMinVertex(distance, visited);
            visited[minVertex] = true;
            
            for(int j = 0; j < v; j++){
                if(adjacencyMatrix[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE){
                    int newDist = distance[minVertex] + adjacencyMatrix[minVertex][j];
                    if(newDist < distance[j]){
                        distance[j] = newDist;
                    }
                }
            }
        }
        
        for (int i = 1; i < v; i++){
            System.out.println("Start: 1" + " Target: " + (i+1) + " Distance: " + distance[i]);
        }
    }
    
    
    
    private static int findMinVertex(int[] distance, boolean visited[]){
        int minVertex = -1;
        for (int i = 0; i < distance.length; i++){
            if(!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])){
                minVertex = i;
            }
        } 
        return minVertex;
    }
    
    /*
    public static Graph calculateShortestPathFromSource(Graph graph, MyNodesNode source) {

        source.setDistance(0);

        Set<MyNodesNode> settledNodes = new HashSet<>();
        Set<MyNodesNode> unsettledNodes = new HashSet<>();
        unsettledNodes.add(source);

        while (unsettledNodes.size() != 0) {
            MyNodesNode currentNode = getLowestDistanceNode(unsettledNodes);
            unsettledNodes.remove(currentNode);
            for (Entry<MyNodesNode, Integer> adjacencyPair : currentNode.getAdjacentNodes().entrySet()) {
                MyNodesNode adjacentNode = adjacencyPair.getKey();
                Integer edgeWeigh = adjacencyPair.getValue();

                if (!settledNodes.contains(adjacentNode)) {
                    CalculateMinimumDistance(adjacentNode, edgeWeigh, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            }
            settledNodes.add(currentNode);
        }
        return graph;
    }

    public static void CalculateMinimumDistance(MyNodesNode evaluationNode, Integer edgeWeigh, MyNodesNode sourceNode) {
        Integer sourceDistance = sourceNode.getDistance();
        if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
            evaluationNode.setDistance(sourceDistance + edgeWeigh);
            LinkedList<MyNodesNode> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            evaluationNode.setShortestPath(shortestPath);
        }
    }

    public static MyNodesNode getLowestDistanceNode(Set<MyNodesNode> unsettledNodes) {
        MyNodesNode lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (MyNodesNode node : unsettledNodes) {
            int nodeDistance = node.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }
    */
}
