package org.example;

public class _92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode first = new ListNode();
        int index = 0;
        ListNode cursor = head;
        first.next = head;
        ListNode temp = new ListNode();
        ListNode last = temp;

        while(true) {
            if(index < left-1) {
                // 첫번째를 지정
                last.next = new ListNode(cursor.val);
                last = last.next;

                first = cursor;
                cursor = cursor.next;
            }
            else if(index >= left-1 && index <= right-2) {
                // 뒤에 이어붙일 노트 임시저장
                ListNode rightNode = (cursor.next).next;
                ListNode leftNode = first.next;
                (cursor.next).next = null;

                first.next = cursor.next;
                (first.next).next = leftNode;
                System.out.println((first.next).val);
                cursor.next = rightNode;
            }
            else if(index > right-2){
                break;
            }
            index ++;
        }

        last.next = first.next;

        return temp.next;
    }

}
