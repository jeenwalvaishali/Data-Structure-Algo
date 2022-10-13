package Question1;
/*
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
Input: root = [1,2,2,3,4,4,3]
Output: true

Input: root = [1,2,2,null,3,null,3]
Output: false
*/

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(2);
//        tree.root.left.left = new TreeNode(3);
        tree.root.left.right = new TreeNode(3);
//        tree.root.right.left = new TreeNode(4);
        tree.root.right.right = new TreeNode(3);

        boolean result = tree.isMirror(tree.root);
        System.out.println(result);

    }
}