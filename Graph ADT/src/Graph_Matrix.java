// Graph implementation with a matrix structure

import java.util.*;

public class Graph_Matrix implements Graph {

    public List<List<Boolean>> Matrix;

    public Graph_Matrix() {
        Matrix = new ArrayList<List<Boolean>>();
    }

    @Override
    public int addNode() {
        int nodeID = Matrix.size();

        List<Boolean> temp = new ArrayList<>();
        for (int i = 0; i < Matrix.size(); i++) {
            temp.add(false);
        }
        Matrix.add(temp);

        for (List<Boolean> node : Matrix) {
            node.add(false);
        }
        return nodeID;
    }

    @Override
    public void addEdge(int source, int destination) {
        Matrix.get(source).set(destination, true);
    }

    public boolean isConnected(int source, int destination) {
        return Matrix.get(source).get(destination);
    }


    @Override
    public List<Integer> getAdjacencyList(int nodeID) {

        List<Integer> result = new ArrayList<>();

        for (int index = 0; index < Matrix.size(); index++) {
            if (isConnected(nodeID, index)) {
                result.add(index);
            }
        }
        return result;
    }

    public String toString() {

        StringBuilder result = new StringBuilder();

        for (int index = 0; index < Matrix.size(); index++) {
            for (int destination : getAdjacencyList(index)) {
                result.append(" ").append(destination);
            }
            result.append("\n");
        }
        return result.toString();
    }
}
