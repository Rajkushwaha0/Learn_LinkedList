class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        ListNode curr = list1;
        while(curr!=null){
            if(curr!=null && curr.val==a){
                while(curr!=null){
                    if(curr.val==b) {
                        curr=curr.next;
                        break;
                    }
                    else if(curr.next!=null && curr.val<=curr.next.val){
                         curr=curr.next;
                    }
                    else{
                        dummy.next=new ListNode(curr.val);
                        dummy=dummy.next;
                        curr=curr.next;
                    }
                }
                while(list2!=null){
                    dummy.next=new ListNode(list2.val);
                    dummy=dummy.next;
                    list2=list2.next;
                }
                
            }
            dummy.next=new ListNode(curr.val);
            dummy=dummy.next;
            curr=curr.next;
        }
        return ans.next;

    }
}
