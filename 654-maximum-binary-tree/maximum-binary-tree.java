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
    public int findMax(int arr[]){
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[index]){
                index = i;
            }
        }
        return index;
    }
    public TreeNode MaximumBinaryTree(int array[]){
        if(array.length==0){
            return null;
        }
        int maxIndex = findMax(array);
        TreeNode newNode = new TreeNode(array[maxIndex]);
        newNode.left = MaximumBinaryTree(Arrays.copyOfRange(array, 0, maxIndex));
        newNode.right = MaximumBinaryTree(Arrays.copyOfRange(array, maxIndex+1, array.length));
        return newNode;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return MaximumBinaryTree(nums);
    }
}