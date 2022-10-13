package Question8;

import java.util.ArrayList;
import java.util.List;

/*
Given the root of a binary tree, collect a tree's nodes as if you were doing this:
Collect all the leaf nodes.
Remove all the leaf nodes.
Repeat until the tree is empty.

Input: root = [1,2,3,4,5]
Output: [[4,5,3],[2],[1]]

Input: root = [1]
Output: [[1]]

* */
public class Main {

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        List<List<Integer>> leaveList = tree.collectLeavesOfBinaryTree(tree.root);
        System.out.println("List of nodes of tree  " + leaveList);
    }
}
