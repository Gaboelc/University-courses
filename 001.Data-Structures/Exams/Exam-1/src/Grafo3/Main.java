package Grafo3;

import Grafo3.Algorithms.TopologicalSort;
//import static Grafo3.Algorithms.dijkstra.DijkstraRun.dijkstraRun;
import Grafo3.Algorithms.dijkstra.Dijkstra;
import static Grafo3.Algorithms.dijkstra.Dijkstra.dijkstra;

public class Main {

    public static void main(String[] args) {
         TopologicalSort g = new TopologicalSort(9);
         
         g.addEdge(1,2);
         g.addEdge(1,3);
         
         g.addEdge(2,4);
         g.addEdge(2,7);
         
         g.addEdge(3,5);
         
         g.addEdge(4,6);
         
         g.addEdge(5,6);
         
         g.addEdge(6,8);
         
         g.addEdge(7,8);
         g.addEdge(7,6);
         
         System.out.println("Ordenamiento topologico del grafo: ");
         g.topologicalSort();
         
         System.out.println("\n");
         
         System.out.println("Encontrando los caminos más cortos entre nodos usando"
                 + " el algoritmo Dijkstra");
         dijkstra();
         //dijkstraRun();
    }
}
