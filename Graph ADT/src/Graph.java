import java.util.List;

public interface Graph {

    public int addNode();

    public void addEdge(int source, int destination);

    public boolean isConnected(int source, int destination);

    public List<Integer> getAdjacencyList(int nodeID);

}
