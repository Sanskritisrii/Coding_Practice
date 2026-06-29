package org;

class Node {
    int data;
    Node next;


    public Node(int data){
        this.data=data;
        this.next=null;
    }
    public Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;

        while(true){
            if(fast == null || fast.next == null){
                return slow;
            }
            fast = fast.next.next;
            slow=slow.next;

        }

    }



    }

