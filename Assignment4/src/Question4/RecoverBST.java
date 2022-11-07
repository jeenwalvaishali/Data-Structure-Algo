package Question4;
/*You are given the root of a binary search tree (BST), where the values of exactly two nodes of the tree were swapped by mistake.
Recover the tree without changing its structure.

Input: root = [1,3,null,null,2]
Output: [3,1,null,null,2]
Explanation: 3 cannot be a left child of 1 because 3 > 1. Swapping 1 and 3 makes the BST valid.

Input: root = [3,1,4,null,null,2]
Output: [2,1,4,null,null,3]
Explanation: 2 cannot be in the right subtree of 3 because 2 < 3. Swapping 2 and 3 makes the BST valid.

* */
public class RecoverBST {
    TreeNode node1;
    TreeNode node2;
    TreeNode prevPointer = new TreeNode(Integer.MIN_VALUE);

    void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left);

        if (root.val < prevPointer.val && node1 == null) {
            node1 = prevPointer;
            node2 = root;
        } else if (root.val < prevPointer.val && node1 != null) {
            node2 = root;
        }
        prevPointer = root;

        inOrderTraversal(root.right);
    }

    public void recoverTree(TreeNode root) {
        inOrderTraversal(root);
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
    }
}
