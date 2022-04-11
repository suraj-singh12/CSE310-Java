import java.util.List;

/**
 * Definition for singly-linked list.
 * */
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public static void main(String[] args) {
        ListNode l3 = new ListNode(4, null);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        ListNode l6 = new ListNode(4, null);
        ListNode l5 = new ListNode(3, l6);
        ListNode l4 = new ListNode(1, l5);

//        while(l1 != null) {
//            System.out.println(l1.val);
//            l1 = l1.next;
//        }
//        while(l4 != null) {
//            System.out.println(l4.val);
//            l4 = l4.next;
//        }

        ListNode l = mergeTwoLists(l1, l4);
        while(l != null) {
            System.out.println(l.val);
            l = l.next;
        }

    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = null;
//         first make newList to point to one of the list (which has first element small)
//         after ensuring that none of the lists points to NULL
        if(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                newList = list1;
                list1 = list1.next;
            }
            else {
                newList = list2;
                list2 = list2.next;
            }
        }
        // if any of the list is NULL then
        else {
            // if first list is not null, point newlist to this, and return
            if(list1 != null) {
                newList = list1;
            } else if(list2 != null) {
                newList = list2;
            }
            return newList;
        }

        // if both lists are not empty, then
        while(list1.next != null && list2.next != null) {
            if(list1.val < list2.val) {
                System.out.println(list1.val);
                ListNode tmp = list1;
                list1 = list1.next;  // ensuring, to be ahead of current node, as it's next ptr will be changed
                newList.next = tmp;
                newList = newList.next;   // now updated to next node
            } else {
                System.out.println(list2.val);
                ListNode tmp = list2;
                list2 = list2.next;
                newList.next = tmp;
                newList = newList.next;
            }
        }

        if(list1 != null) {
            // System.out.println(list1.val);
            newList.next = list1;
        } else {
            // System.out.println(list2.val);
            newList.next = list2;
        }
        return newList;
    }
}