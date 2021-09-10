package Tarea_programada_2;

import Tarea_programada_2.Node;
import Tarea_programada_2.Graph;

public class Test {

    public static void main(String[] args) {
        
        Graph lettersGraph = new Graph(false);
        Node a = new Node(0, "a");
        Node b = new Node (1, "b");
        Node c = new Node (2, "c");
        Node d = new Node (3, "d");
        Node e = new Node (4, "e");
        Node f = new Node (5, "f");
        Node g = new Node (6, "g");
        Node h = new Node (7, "h");
        Node i = new Node (8, "i");
        
        lettersGraph.addEdge(a,b);
        lettersGraph.addEdge(a,h);
        
        lettersGraph.addEdge(b,h);
        lettersGraph.addEdge(b,c);
        lettersGraph.addEdge(b,a);
        
        lettersGraph.addEdge(c,i);
        lettersGraph.addEdge(c,f);
        lettersGraph.addEdge(c,d);
        lettersGraph.addEdge(c,b);
        
        lettersGraph.addEdge(d,e);
        lettersGraph.addEdge(d,f);
        lettersGraph.addEdge(d,c);
        
        lettersGraph.addEdge(e,d);
        lettersGraph.addEdge(e,f);
        
        lettersGraph.addEdge(f,e);
        lettersGraph.addEdge(f,d);
        lettersGraph.addEdge(f,c);
        lettersGraph.addEdge(f,g);
        
        lettersGraph.addEdge(g,i);
        lettersGraph.addEdge(g,h);
        lettersGraph.addEdge(g,f);
        
        lettersGraph.addEdge(h,i);
        lettersGraph.addEdge(h,a);
        lettersGraph.addEdge(h,g);
        lettersGraph.addEdge(h,b);
        
        lettersGraph.addEdge(i,h);
        lettersGraph.addEdge(i,g);
        lettersGraph.addEdge(i,c);
        
        Graph citiesGraph = new Graph(false);
        Node losAngeles = new Node(0, "losAngeles");
        Node malibu = new Node(0, "malibu");
        Node santaBarbara = new Node(0, "santaBarbara");
        Node barstow = new Node(0, "barstow");
        Node palmSprings = new Node(0, "palmSprings");
        Node elCajon = new Node(0, "elCajon");
        Node sanDiego = new Node(0, "sanDiego");
        Node riverside = new Node(0, "riverside");
        
        citiesGraph.addEdge(losAngeles, malibu);
        citiesGraph.addEdge(losAngeles, santaBarbara);
        citiesGraph.addEdge(losAngeles, riverside);
        citiesGraph.addEdge(losAngeles, sanDiego);
        
        citiesGraph.addEdge(malibu, santaBarbara);
        citiesGraph.addEdge(malibu, losAngeles);
        
        citiesGraph.addEdge(santaBarbara, malibu);
        citiesGraph.addEdge(santaBarbara, losAngeles);
        citiesGraph.addEdge(santaBarbara, barstow);
        
        citiesGraph.addEdge(barstow, santaBarbara);
        citiesGraph.addEdge(barstow, riverside);
        
        citiesGraph.addEdge(riverside, palmSprings);
        citiesGraph.addEdge(riverside, sanDiego);
        citiesGraph.addEdge(riverside, barstow);
        citiesGraph.addEdge(riverside, losAngeles);
        
        citiesGraph.addEdge(palmSprings, riverside);
        
        citiesGraph.addEdge(sanDiego, elCajon);
        citiesGraph.addEdge(sanDiego, riverside);
        citiesGraph.addEdge(sanDiego, losAngeles);
        
        citiesGraph.addEdge(elCajon, sanDiego);
        
        System.out.println("BFS:");
        lettersGraph.breadthFirstSearchModified(a);
        lettersGraph.resetNodesVisited();
        lettersGraph.breadthFirstSearchModified(c);
        lettersGraph.resetNodesVisited();
        
        citiesGraph.breadthFirstSearchModified(losAngeles);
        citiesGraph.resetNodesVisited();
        citiesGraph.breadthFirstSearchModified(barstow);
        citiesGraph.resetNodesVisited();
        
        System.out.println("DFS:");
        lettersGraph.depthFirstSearchModified(a);
        lettersGraph.resetNodesVisited();
        System.out.println();
        lettersGraph.depthFirstSearchModified(c);
        System.out.println();
        
        citiesGraph.depthFirstSearchModified(losAngeles);
        System.out.println();
        citiesGraph.resetNodesVisited();
        citiesGraph.depthFirstSearchModified(barstow);
        
    }
}
