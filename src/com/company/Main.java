package com.company;

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

    }
}
