package Question5;

import java.util.*;

public class BinaryTree {

    TreeNode root;

    BinaryTree(){
        root = null;
    }

    public List<List<Integer>> verticalOrderTraversal(TreeNode root) {
        List<List<Integer>> traversalList = new ArrayList<>();
        if (root == null) {
            return traversalList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> verticalQueue = new LinkedList<>();
        Map<Integer, List<Integer>> map = new TreeMap<>();
        queue.offer(root);
        verticalQueue.offer(0);
        int min = 0, max = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            int col = verticalQueue.poll();
            if (!map.containsKey(col)) map.put(col, new ArrayList<>());
            map.get(col).add(node.val);
            if (node.left != null) {
                queue.offer(node.left);
                verticalQueue.offer(col - 1);
                min = Math.min(min, col - 1);
            }
            if (node.right != null) {
                queue.offer(node.right);
                verticalQueue.offer(col + 1);
                max = Math.max(max, col + 1);
            }
        }
        traversalList.addAll(map.values());
        return traversalList;
    }
}
