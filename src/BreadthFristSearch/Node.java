package BreadthFristSearch;

import java.util.ArrayList;
import java.util.List;

public class Node {
    int data;
    List<Node> neighbors;

    public Node(int data) {
        this.data = data;
        this.neighbors = new ArrayList<>();
    }

    public void addNeighbor(Node neighbor) {
        this.neighbors.add(neighbor);
    }

    public List<Node> getNeighbors() {
        return this.neighbors;
    }
}
