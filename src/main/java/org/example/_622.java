package org.example;

class MyCircularQueue {
    int [] circularQueue = null;
    int front = 0;
    int tail = 0;
    int size = 0;
    int length = 0;
    public MyCircularQueue(int k) {
        circularQueue = new int[k];
        size = 0;
        tail = 0;
        length = k;
    }

    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        }
        circularQueue[tail] = value;
        tail = (tail+1)%length;
        size ++;
        System.out.println(front);
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }
        front = (front+1)%length;
        size--;
        return true;
    }

    public int Front() {
        if(isEmpty()) {
            return -1;
        }
        return circularQueue[front];
    }

    public int Rear() {
        if(isEmpty()) {
            return -1;
        }
        return circularQueue[(tail+length-1)%length];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
