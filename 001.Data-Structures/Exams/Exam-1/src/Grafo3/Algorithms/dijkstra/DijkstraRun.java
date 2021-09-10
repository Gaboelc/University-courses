package Grafo3.Algorithms.dijkstra;

public class DijkstraRun {

    public static void dijkstraRun() {
        MyNodesNode node1 = new MyNodesNode("1");
        MyNodesNode node2 = new MyNodesNode("2");
        MyNodesNode node3 = new MyNodesNode("3");
        MyNodesNode node4 = new MyNodesNode("4");
        MyNodesNode node5 = new MyNodesNode("5");
        MyNodesNode node6 = new MyNodesNode("6");
        MyNodesNode node7 = new MyNodesNode("7");
        MyNodesNode node8 = new MyNodesNode("8");

        node1.addDestination(node2, 2);
        node1.addDestination(node3, 4);
        
        node2.addDestination(node7, 2);
        node2.addDestination(node4, 1);
        
        node3.addDestination(node5, 1);
        
        node4.addDestination(node6, 3);
        
        node5.addDestination(node6, 2);
        
        node6.addDestination(node8, 8);
        
        node7.addDestination(node8, 5);
        node7.addDestination(node6, 5);

        Graph graph = new Graph();

        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addNode(node4);
        graph.addNode(node5);
        graph.addNode(node6);
        graph.addNode(node7);
        graph.addNode(node8);        

        graph = Dijkstra.calculateShortestPathFromSource(graph, node1);

        for (MyNodesNode currentNode : graph.getNodes()) {
            int total_distance = 0; 
            System.out.println("-" + currentNode.getName());
            for (MyNodesNode oneAdjacent : currentNode.getShortestPath()) {
                System.out.println("--" + oneAdjacent.getName() + " at: " + oneAdjacent.getDistance());
                total_distance += oneAdjacent.getDistance();
            }
            System.out.println("total_distance: " + (total_distance+1));
            System.out.println("------------");
        }
    }
}
