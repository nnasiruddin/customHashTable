package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        HashTableCustom hashTable = new HashTableCustom(10);
        hashTable.put("A", "VALUE_A");
        hashTable.put("B", "VALUE_B");

        System.out.println(hashTable.get("A"));

        System.out.println(hashTable.getSize());
    }
}
