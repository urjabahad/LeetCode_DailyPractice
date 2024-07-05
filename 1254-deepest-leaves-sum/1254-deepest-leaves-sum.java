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
 /*
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q=new LinkedList<>();
        int sum=0;
        q.add(root);
        while(!q.isEmpty()){
            sum=0;
            for(int i=0;i<q.size();i++){
                TreeNode t=q.remove();
                sum+=t.val;
                if(t.left!=null){
                    q.add(t.left);
                }
                if(t.right!=null){
                    q.add(t.right);
                }
            }
        }
        return sum;
    }
}
*/
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int sum = 0;
        
        while (!q.isEmpty()) {
            int levelSum = 0;
            int levelSize = q.size();
            
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.remove();
                levelSum += node.val;
                
                if (node.left != null) {
                    q.add(node.left);
                }
                
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            
            sum = levelSum; // Update sum to the current level sum
        }
        
        return sum;
    }
}
