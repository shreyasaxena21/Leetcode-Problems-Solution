class Solution {
     // TC O(N) SC O(1)
    public ListNode swapPairs(ListNode head) {
        // LinkedList is Empty or LinkedList having one node
        if(head == null || head.next == null){
            return head;
        }
        // after swap there would be a new head
        ListNode newHead = head.next;
        ListNode current = head;
        ListNode prev = null; // track the last node of the prev swapped pair
        while(current!=null && current.next!=null){
            // find out the pairs for swapping
            ListNode first = current;
            ListNode second = current.next;
            ListNode nextPair = second.next;
            // swap happens here
            second.next = first;
            first.next = nextPair;
            if(prev!=null){
                prev.next = second;
            }
            prev = first;
            current = nextPair;

            
        }
        return newHead;
    }
}