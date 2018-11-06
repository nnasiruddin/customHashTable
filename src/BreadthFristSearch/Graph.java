package BreadthFristSearch;

import java.util.*;

public class Graph {

    private Queue<Node> queue;
    private Stack<Node> stack;
    static Set<Node> hashSet = new HashSet<>();

    public Graph () {
        queue = new LinkedList<>();
        stack = new Stack<>();
    }

    public boolean bfs (Node root, int key) {
        queue.add(root);
        hashSet.clear();
        hashSet.add(root);

        while(!queue.isEmpty()) {
            Node element = queue.remove();
            System.out.println(element.data);
            if (element.data == key) {
                return true;
            }
            List<Node> neighbors = element.getNeighbors();
            for (Node n : neighbors) {
                if(n != null && !hashSet.contains(n)) {
                    queue.add(n);
                    hashSet.add(n);
                }
            }
        }

        return false;
    }

    public boolean dfs (Node root, int key) {
        stack.add(root);
        hashSet.clear();
        hashSet.add(root);

        while(!stack.isEmpty()) {
            Node element = stack.pop();
            System.out.println(element.data);

            if(element.data == key) {
                return true;
            }

            List<Node> neighbors = element.getNeighbors();
            for(Node n : neighbors) {
                if(n != null && !hashSet.contains(n)) {
                    stack.push(n);
                    hashSet.add(n);
                }
            }
        }

        return false;
    }
}
