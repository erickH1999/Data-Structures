// Graph implementation with a list structure

import java.util.*;

public class Graph_List implements Graph{

    public ArrayList<List<Integer>> adjacencyList;

    public Graph_List() {
        adjacencyList = new ArrayList<List<Integer>>();
    }

    public int addNode() {

        int nodeID = adjacencyList.size();
        adjacencyList.add(new ArrayList<>());

        return  nodeID;
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
    }

    public boolean isConnected(int source, int destination) {

        for (int nodeID : adjacencyList.get(source)) {
            if (nodeID == destination) {
                return true;
            }
        }
        return false;
    }

    public List<Integer> getAdjacencyList(int nodeID) {
        return adjacencyList.get(nodeID);
    }

    public String toString() {
        StringBuilder text = new StringBuilder();

        for (List<Integer> node : adjacencyList) {
            for (int edge : node) {
                text.append(" ").append(edge);
            }
            text.append("\n");
        }
        return text.toString();
    }



}
