package org.example;

public class _328 {
    public ListNode oddEvenList(ListNode head) {
        ListNode resultNode = new ListNode();
        ListNode cursor1 = new ListNode();
        ListNode cursor2 = new ListNode();
        // 각각의 커서를 둔다, cursor1 은 홀수를 위한 노드, cursor2는 짝수를 위한 노드
        cursor1 = resultNode;
        cursor2 = resultNode;

        // 전제 노드 반복
        while(head != null) {
            int a = head.val;
            // 짝수 노드가 없다면
            if(head.next == null) {
                // cursor1에 넣고 끝내기
                ListNode temp = cursor1.next;
                cursor1.next = new ListNode(a);
                cursor1 = cursor1.next;
                cursor1.next = temp;
                break;
            }
            head = head.next;
            int b = head.val;
            head = head.next;

            // cursor2에 먼저 넣기, 그리고 커서 움직이기
            cursor2.next = new ListNode(b);
            cursor2 = cursor2.next;

            // cursor1에 넣고, 커서 움직이기
            // 근데 cursor1에 넣을 때는, 분리 후, 넣고 다시 붙여주는 작업을 한다.
            ListNode temp = cursor1.next;
            cursor1.next = new ListNode(a);
            cursor1 = cursor1.next;
            cursor1.next = temp;
        }

        return resultNode.next;
}
