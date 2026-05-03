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
    ArrayList<Integer> ans = new ArrayList<>();
    public void arr(TreeNode root){
        if(root==null){
            return;
        }
        ans.add(root.val);
        arr(root.left);
        arr(root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        arr(root);
        return ans;
    }
}