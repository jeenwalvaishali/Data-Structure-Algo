package Question3;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    TreeNode root;

    BinaryTree(){
        root = null;
    }

    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (root == null){
            return result;
        }
        return rightView(root, result, 0);
    }

    public List<Integer> rightView(TreeNode root, ArrayList<Integer> result, int height) {

        if (height == result.size()) {
            result.add(root.val);
        }

        if (root.right != null) {
            rightView(root.right, result, height + 1);

        }
        if (root.left != null) {
            rightView(root.left, result, height + 1);
        }
        return result;
    }
}
