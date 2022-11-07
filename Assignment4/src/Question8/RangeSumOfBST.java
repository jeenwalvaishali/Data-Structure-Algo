package Question8;
/*
Given the root node of a binary search tree and two integers low and high,
return the sum of values of all nodes with a value in the inclusive range [low, high].

Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
Output: 32
Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.

Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
Output: 23
Explanation: Nodes 6, 7, and 10 are in the range [6, 10]. 6 + 7 + 10 = 23.
* */
public class RangeSumOfBST {

    int sum = 0;
    int minimum = 0;
    int maximum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        this.minimum = low;
        this.maximum = high;
        inOrderTraversal(root);
        return sum;
    }

    public void inOrderTraversal(TreeNode node) {
        if(node == null) {
            return;
        }

        if(minimum < node.val) {
            inOrderTraversal(node.left);
        }

        if(node.val <= maximum && node.val >= minimum) {
            sum += node.val;
        }

        if(maximum > node.val) {
            inOrderTraversal(node.right);
        }
    }
}
