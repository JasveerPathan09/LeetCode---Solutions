class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
        ListNode currentRunner = dummyHead;
        
        ListNode p1 = list1;
        ListNode p2 = list2;
        
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                currentRunner.next = p1;
                p1 = p1.next;
            } else {
                currentRunner.next = p2;
                p2 = p2.next;
            }
            currentRunner = currentRunner.next;
        }
        
        if (p1 != null) {
            currentRunner.next = p1;
        }
        
        if (p2 != null) {
            currentRunner.next = p2;
        }
        
        return dummyHead.next;
    }
}
