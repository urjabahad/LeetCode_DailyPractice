/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);  // Equivalent to q.offer(root), adds element to the end of the queue
        
        int sum = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            sum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode t = q.remove();  // Removes and returns the head of the queue
                sum += t.val;

                if (t.left != null) {
                    q.add(t.left);  // Equivalent to q.offer(t.left), adds left child to the end of the queue
                }

                if (t.right != null) {
                    q.add(t.right);  // Equivalent to q.offer(t.right), adds right child to the end of the queue
                }
            }
        }

        return sum;
    }
}

