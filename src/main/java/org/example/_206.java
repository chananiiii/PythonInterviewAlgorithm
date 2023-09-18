package org.example;

public class _206 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode cursor = new ListNode();
        ListNode lastNode =  cursor;
        ListNode nextTempNode = null;
        int i = 0;
        while(head != null) {
            nextTempNode = head.next;
            head.next = cursor;
            cursor = head;
            head = nextTempNode;
            if(i == 0) {
                cursor.next = null;
            }
            i ++;
        }
        return cursor;
    }
}
