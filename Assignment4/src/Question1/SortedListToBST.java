package Question1;

/*Given the head of a singly linked list where elements are sorted in ascending order, convert it to a height-balanced binary search tree.
Input: head = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: One possible answer is [0,-3,9,-10,null,5], which represents the shown height balanced BST.

Input: head = []
Output: []
* */
public class SortedListToBST {

    public ListNode midOfLL(ListNode head, ListNode tail) {

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (fastPointer != tail && fastPointer.next != tail) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return slowPointer;
    }

    public TreeNode bSTConstruct(ListNode head, ListNode tail) {

        if (head == tail) {
            return null;
        }

        ListNode middle = midOfLL(head, tail);

        TreeNode root = new TreeNode(middle.val);
        root.left = bSTConstruct(head, middle);
        root.right = bSTConstruct(middle.next, tail);

        return root;
    }

    public TreeNode sortedListToBST(ListNode head) {

        if (head == null) {
            return null;
        }

        return bSTConstruct(head, null);
    }
}
