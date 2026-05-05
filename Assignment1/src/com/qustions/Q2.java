package com.qustions;
// Write a function to search a Node of given key into singly linked list. 
//(stop search when key is found)

class Q2 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node search(Node head, int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) return temp;
            temp = temp.next;
        }

        return null;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        Node res = search(head, 89);
        System.out.println(res != null ? "Found" : "Not Found");
    }
}