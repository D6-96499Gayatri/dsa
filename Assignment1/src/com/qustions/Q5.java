package com.qustions;

public class Q5 {


    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node tail = null; // only pointer

    
    void insertAtBeginning(int val) {
        Node newNode = new Node(val);

        if (tail == null) {
            tail = newNode;
            tail.next = tail;
            return;
        }

        newNode.next = tail.next; // head
        tail.next = newNode;
    }

   
    void insertAtEnd(int val) {
        Node newNode = new Node(val);

        if (tail == null) {
            tail = newNode;
            tail.next = tail;
            return;
        }

        newNode.next = tail.next; // head
        tail.next = newNode;
        tail = newNode; // update tail
    }

    
    void deleteHead() {
        if (tail == null) return;

        if (tail.next == tail) { // single node
            tail = null;
            return;
        }

        tail.next = tail.next.next;
    }

  
    void deleteEnd() {
        if (tail == null) return;

        if (tail.next == tail) {
            tail = null;
            return;
        }

        Node temp = tail.next; // head

        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = tail.next;
        tail = temp;
    }

  
    boolean search(int key) {
        if (tail == null) return false;

        Node temp = tail.next; // head

        do {
            if (temp.data == key) return true;
            temp = temp.next;
        } while (temp != tail.next);

        return false;
    }

  
    void display() {
        if (tail == null) {
            System.out.println("Empty");
            return;
        }

        Node temp = tail.next;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println("(circular)");
    }

  
    public static void main(String[] args) {

        Q5 cll = new Q5();

        cll.insertAtEnd(10);
        cll.insertAtEnd(20);
        cll.insertAtEnd(30);

        cll.display();

        cll.insertAtBeginning(5);
        cll.display();

        cll.deleteHead();
        cll.display();

        cll.deleteEnd();
        cll.display();

        System.out.println(cll.search(20)); // true
    }
}