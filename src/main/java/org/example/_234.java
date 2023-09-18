package org.example;

import java.util.Deque;
import java.util.LinkedList;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class _234 {

    public boolean isPalindrome(ListNode head) {
        Deque<Integer> deque = new LinkedList<>();
        ListNode node = head;
        while(node != null) {
            deque.add(node.val);
            node = node.next;
        }
        boolean result = true;
        while(deque.size() > 1) {
            int left = deque.pollFirst();
            int right = deque.pollLast();
            if(left != right) {
                result = false;
            }
        }
        return result;
    }
}
