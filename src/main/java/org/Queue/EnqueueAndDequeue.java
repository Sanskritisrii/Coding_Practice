package org.Queue;

public class EnqueueAndDequeue {


        int[] queue;
        int front;
        int rear;
        int size;

        public EnqueueAndDequeue(int size) {
            this.size = size;
            queue = new int[size];
            front = -1;
            rear = -1;
        }

        // Enqueue
        public void enqueue(int data) {

            if (rear == size - 1) {
                System.out.println("Queue Overflow");
                return;
            }

            if (front == -1) {
                front = 0;
            }

            rear++;
            queue[rear] = data;

            System.out.println(data + " ");
        }

        // Dequeue
        public void dequeue() {

            if (front == -1 || front > rear) {
                System.out.println("Queue Underflow");
                return;
            }

            System.out.println(queue[front] + " ");
            front++;

            if (front > rear) {
                front = rear = -1;
            }
        }

        // Display
        public void display() {

            if (front == -1) {
                System.out.println("Queue Empty");
                return;
            }

            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }

            System.out.println();
        }
    }

