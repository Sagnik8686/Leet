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
    List<List<Integer>> lis=new ArrayList<>();
    void level(List<List<Integer>> lis,int i,TreeNode node){
        if(node==null)
            return;
        if(lis.size()<=i)
            lis.add(new ArrayList<>());
        lis.get(i).add(node.val);
        level(lis,i+1,node.left);
        level(lis,i+1,node.right);
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        level(lis,0,root);
        Collections.reverse(lis);
        return lis;
    }
}