public class removeDuplicates_83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        while(p!=null){
            while(p.next!=null && p.next.val == p.val){
                p.next = p.next.next;
            }
                p=p.next;
        }
        return head;
    }
}
