package com.qustions;

public class Q4 {



  
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

   
    void insertSorted(int val) {
        Node newNode = new Node(val);

        // Case 1: empty list OR insert at beginning
        if (head == null || val < head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data < val) {
            temp = temp.next;
        }

        // Insert node
        newNode.next = temp.next;
        temp.next = newNode;
    }

   
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

   
    public static void main(String[] args) {
      Q4 list = new Q4();

        list.insertSorted(30);
        list.insertSorted(10);
        list.insertSorted(20);
        list.insertSorted(25);
        list.insertSorted(5);

        list.display();  // 5 -> 10 -> 20 -> 25 -> 30 -> null
    }
}