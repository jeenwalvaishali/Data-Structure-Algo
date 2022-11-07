package Question7;
/*Given the root of a binary search tree and a node p in it, return the in-order successor of that node in the BST.
If the given node has no in-order successor in the tree, return null.
The successor of a node p is the node with the smallest key greater than p.val.

Input: root = [2,1,3], p = 1
Output: 2
Explanation: 1's in-order successor node is 2. Note that both p and the return value is of TreeNode type.


Input: root = [5,3,6,2,4,null,null,1], p = 6
Output: null
Explanation: There is no in-order successor of the current node, so the answer is null.
* */
public class InorderSuccessorBST {
    private TreeNode successor = null;
    private boolean isSuccessor = false;
    private boolean isContainNode = false;

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        inOrderTraversal(root, p);
        return successor;
    }

    private void inOrderTraversal(TreeNode root, TreeNode p) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left, p);

        if (isContainNode && !isSuccessor) {
            successor = root;
            isSuccessor = true;
            return;
        }

        if (root.equals(p)) {
            isContainNode = true;
        }

        inOrderTraversal(root.right, p);

    }
}