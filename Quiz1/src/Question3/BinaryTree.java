package Question3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {

    TreeNode root;
    public BinaryTree(){
        root = null;
    }

    public  List<List<Integer>> levelOrderTraversal(TreeNode root){

        List<List<Integer>> tempList = new ArrayList();
        if (root == null) {
            return tempList;
        }
        LinkedList<TreeNode> q = new LinkedList();
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> l1 = new ArrayList();
            for(int i=0; i<size; i++) {
                TreeNode node = q.poll();
                l1.add(node.value);
                if(node.left != null) {
                    q.add(node.left);
                }

                if(node.right != null) {
                    q.add(node.right);
                }
            }
            tempList.add(l1);
        }

        return tempList;

    }


}
