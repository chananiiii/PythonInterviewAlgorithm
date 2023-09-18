package org.example;

public class _21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode cursor = result;

        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                cursor.next = list1;
                list1 = list1.next;
            }
            else {
                cursor.next = list2;
                list2 = list2.next;
            }
            cursor = cursor.next;
        }

        if(list1 == null) {
            cursor.next = list2;
        }
        else {
            cursor.next = list1;
        }

        return result.next;
    }

}
