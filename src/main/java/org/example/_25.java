package org.example;

public class _25 {
    public ListNode swapPairs(ListNode head) {
        ListNode result = new ListNode();
        ListNode cursor = result;
        
        // 전부 돌리기
        while(head != null) {
            // 첫번째 값 추출
            int a = head.val;
            // 다음으로 넘김
            head = head.next;
            // 다음 값이 없다면, a만 넣고 루프 빠져나가기
            if(head == null) {
                cursor.next = new ListNode(a);
                break;
            }
            // 2번째까지 값있다면, 스왑진행
            // b 먼저 넣고 커서 옮기기
            int b = head.val;
            head = head.next;
            cursor.next = new ListNode(b);
            cursor = cursor.next;
            // a 넣기
            cursor.next = new ListNode(a);
            cursor = cursor.next;
        }
        return result.next;
    }
}
