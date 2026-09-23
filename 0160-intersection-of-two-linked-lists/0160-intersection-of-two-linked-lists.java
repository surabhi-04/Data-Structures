/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // If either list is empty, there can't be an intersection
        if (headA == null || headB == null) return null;
        
        ListNode a = headA;
        ListNode b = headB;
        
        // Loop until the two pointers point to the exact same node (or both hit null)
        while (a != b) {
            // If pointer 'a' reaches the end of list A, redirect it to the head of list B
            a = (a == null) ? headB : a.next;
            
            // If pointer 'b' reaches the end of list B, redirect it to the head of list A
            b = (b == null) ? headA : b.next;
        }
        
        // Either they met at the intersection, or they both became null (no intersection)
        return a;
    }
}