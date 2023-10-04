package org.example;

class MyCircularDeque {
    int size = 0;
    int length = 0;
    Node front = null;
    Node tail = null;
    public MyCircularDeque(int k) {
        front = new Node();
        length = k;
        size = 0;
        tail = front;
    }

    public boolean insertFront(int value) {
        if(size == length) {
            return false;
        }
        if(size == 0) {
            front = new Node(value);
            tail = front;
            size++;
            return true;
        }
        Node node = new Node(value);
        front.prev = node;
        node.next = front;
        front = node;
        size ++;
        return true;
    }

    public boolean insertLast(int value) {
        if(size == length) {
            return false;
        }
        if(size == 0) {
            front = new Node(value);
            tail = front;
            size++;
            return true;
        }
        Node node = new Node(value);
        node.prev = tail;
        tail.next = node;
        tail = tail.next;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if(size == 0) {
            return false;
        }
        Node node = front.next;
        front = null;
        front = node;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if(size == 0) {
            return false;
        }
        Node node = tail.prev;
        tail = null;
        tail = node;
        size--;
        return true;
    }

    public int getFront() {
        if(isEmpty()) {
            return -1;
        }
        return front.data;
    }

    public int getRear() {
        if(isEmpty()) {
            return -1;
        }
        return tail.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == length;
    }
}

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    Node() {

    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */