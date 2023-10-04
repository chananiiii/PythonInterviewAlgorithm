package org.example;

import java.util.PriorityQueue;

public class _23 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<lists.length; i++) {
            ListNode node = lists[i];
            while(node != null) {
                pq.add(node.val);
                node = node.next;
            }
        }
        ListNode result = new ListNode();
        ListNode cursor = result;
        while(!pq.isEmpty()) {
            cursor.next = new ListNode(pq.poll());
            cursor = cursor.next;
        }
        return result.next;
    }
}
