package com.qustions;

class Q3 {

   
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

  
    void insertEnd(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // =====================================================
    // (i) INSERT AFTER GIVEN DATA
    // =====================================================
    void insertAfter(int key, int val) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }

        System.out.println("Key not found");
    }

   
    void insertBefore(int key, int val) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // case: insert before head
        if (head.data == key) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
            return;
        }

        Node prev = null;
        Node curr = head;

        while (curr != null) {
            if (curr.data == key) {
                Node newNode = new Node(val);
                prev.next = newNode;
                newNode.next = curr;
                return;
            }
            prev = curr;
            curr = curr.next;
        }

        System.out.println("Key not found");
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

       Q3 list = new Q3();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);

        list.display();

        list.insertAfter(20, 25);   
        list.display();

        list.insertBefore(10, 5);   
        list.display();
    }
}