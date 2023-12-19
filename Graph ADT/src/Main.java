// Erick Huerta

/*
    Implement the graph ADT using the adjacency list structure.
    Implement the graph ADT using the adjacency matrix structure
 */

// Main class that calls both the Matrix and list classes

public class Main {
    public static void main(String[] args) {

        Graph_List list = new Graph_List();
        int node1 = list.addNode();
        int node2 = list.addNode();
        int node3 = list.addNode();

        list.addEdge(node1, node2);
        list.addEdge(node3, node1);

        System.out.println(list);

        Graph_Matrix matrix = new Graph_Matrix();
        int node4 = matrix.addNode();
        int node5 = matrix.addNode();
        int node6 = matrix.addNode();
        
        matrix.addEdge(node4, node5);
        matrix.addEdge(node6, node4);

        System.out.println(matrix);

    }
}