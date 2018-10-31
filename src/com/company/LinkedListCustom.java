package com.company;

public class LinkedListCustom {

    ListNode head;
    int size;

    LinkedListCustom() {
        this.head = null;
    }

    public ListNode getHead() {
        return this.head;
    }

    public void add(int data) {
        ListNode currentNode = this.head;
        if(currentNode == null) {
            this.head = new ListNode(data);
            size++;
            return;
        }
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new ListNode(data);
        size++;
    }

    public ListNode get(int data) {
        ListNode currentNode = this.head;
        while(currentNode.next != null) {
            if(currentNode.data == data) {
                return currentNode;
            }
        }

        return null;
    }

    public void delete(int data) {
        ListNode currentNode = this.head;
        ListNode previousNode = null;
        while(currentNode != null) {
            if(currentNode.data == data) {
                previousNode.next = currentNode.next;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public void printList() {
        ListNode currentNode = this.head;
        while(currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public void insert(int index, int data) {
        if(index > size + 1) {
            throw new IllegalArgumentException("Cannot Insert At This Position");
        }
        ListNode currentNode = this.head;
        int currentIndex = 0;
        ListNode previousNode = null;
        while(currentNode != null) {
            if(currentIndex == index) {
                ListNode newNode = new ListNode(data);
                previousNode.next = newNode;
                newNode.next = currentNode;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
            currentIndex++;
        }
    }

}
