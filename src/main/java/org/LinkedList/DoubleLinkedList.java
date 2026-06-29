package org.LinkedList;

public class DoubleLinkedList {
    class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    Node head;

     void insertAtfirst(int data){
         Node newNode = new Node(data);

         if(head==null){
             head=newNode;
             return;
         }

         newNode.next=head;
         head.prev= newNode;
         head = newNode;
     }

     void insertAtend(int data){
         Node newNode = new Node(data);

         if(head==null){
             head=newNode;
             return;
         }

         Node temp= head;

         while(temp.next!= null){
             temp = temp.next;
         }
         temp.next=newNode;
         newNode.prev = temp;
     }

     void deleteAtfirst(){

         if(head == null){
             System.out.println("List is empty");
             return;
         }

         head.next= head;

         if(head!=null){
             head.prev=null;
         }
     }

}
