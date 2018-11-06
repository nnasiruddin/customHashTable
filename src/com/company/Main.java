package com.company;

import BreadthFristSearch.Graph;
import BreadthFristSearch.Node;

public class Main {

    public static void main(String[] args) {
	    // HashTable
        /**
        HashTableCustom hashTable = new HashTableCustom(10);
        hashTable.put("A", "VALUE_A");
        hashTable.put("B", "VALUE_B");

        System.out.println(hashTable.get("A"));

        System.out.println(hashTable.getSize());
         **/

       /**
        //LinkedList

        LinkedListCustom customList = new LinkedListCustom();
        customList.add(1);
        customList.add(3);

        customList.printList();

        System.out.println("");

        System.out.println("Insert at index");

        customList.insert(1, 2);
        customList.printList();

        System.out.println("");
        System.out.println("Delete 3 From List");

        customList.delete(3);
        customList.printList();

        System.out.println("");
        System.out.println("Get Head");

        System.out.println(customList.getHead().data);
        **/

        Graph graph = new Graph();
        Node node40 = new Node(40);
        Node node10 = new Node(10);
        Node node20 = new Node(20);
        Node node30 = new Node(30);
        Node node60 = new Node(60);
        Node node50 = new Node(50);
        Node node70 = new Node(70);

        node40.addNeighbor(node10);
        node40.addNeighbor(node20);
        node10.addNeighbor(node30);
        node20.addNeighbor(node10);
        node20.addNeighbor(node30);
        node20.addNeighbor(node60);
        node20.addNeighbor(node50);
        node30.addNeighbor(node60);
        node60.addNeighbor(node70);
        node50.addNeighbor(node70);

        Boolean isPresent = graph.bfs(node40, 30);
        System.out.println(isPresent);

        isPresent = graph.dfs(node40, 30);
        System.out.println(isPresent);
    }
}
