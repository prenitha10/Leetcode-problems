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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        preorder(arr,root);
        return arr;        
    }
    public void preorder(List<Integer> arr,TreeNode root)
    {
        if(root!=null)
        {
            arr.add(root.val);
            preorder(arr,root.left);
            preorder(arr,root.right);
        }
    }
}