/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {

    HashSet<ListNode> visited = new HashSet<>();
    ListNode tmp = head;

    while (tmp != null) {
        if (visited.contains(tmp)) {
            return true;
        }

        visited.add(tmp);
        tmp = tmp.next;
    }

    return false;
     
        
    }
}
