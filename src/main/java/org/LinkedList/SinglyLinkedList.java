package org.LinkedList;

public class SinglyLinkedList {
    Node head;
    public void insertFront(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);

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
    public void insertMiddle(int position, int data) {

        Node newNode = new Node(data);

        if (position == 1) {
            insertFront(data);
            return;
        }

        Node temp = head;

        for (int i = 1; i < position- 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("no Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteFront() {

        if (head == null) {
            System.out.println("empty");
            return;
        }

        head = head.next;
    }

    public void deleteEnd() {

        if (head == null) {
            System.out.println("Empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    public void deleteMiddle(int position) {

        if (head == null) {
            System.out.println("Empty");
            return;
        }

        if (position == 1) {
            deleteFront();
            return;
        }

        Node temp = head;

        for (int i = 1; i < position -1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("No Position");
            return;
        }

        temp.next = temp.next.next;
    }


    public void travers() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

}
