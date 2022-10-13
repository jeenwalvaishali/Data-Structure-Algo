package Question8;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    TreeNode root;

    BinaryTree(){
        root = null;
    }

    public List<List<Integer>> collectLeavesOfBinaryTree(TreeNode root) {
        List<List<Integer>> leaveList = new ArrayList<>();

        if (root == null) {
            return leaveList;
        }

        findLeaves(root, leaveList);
        return leaveList;
    }

    private int findLeaves(TreeNode root, List<List<Integer>> leaveList) {
        if (root == null) {
            return -1;
        }

        int left = findLeaves(root.left, leaveList);
        int right = findLeaves(root.right, leaveList);

        int result = Math.max(left, right) + 1;

        if (result == leaveList.size()) {
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            leaveList.add(list);
        } else {
            List<Integer> list = leaveList.get(result);
            list.add(root.val);
        }

        return result;
    }
}
