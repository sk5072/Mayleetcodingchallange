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
    public boolean isCousins(TreeNode root, int x, int y) {
        int xl=level(root,x,0);
        int yl=level(root,y,0);
        if(xl==yl && !parent(root,x,y))
            return true;
        return false;
    }
    
    public int level(TreeNode root,int value,int len)
    {
        if(root==null)
            return 0;
        if(root.val==value)
            return len;
        int dnlevel=level(root.left,value,len+1);
        if(dnlevel!=0)
            return dnlevel;
        dnlevel=level(root.right,value,len+1);
        return dnlevel;
    }
    boolean parent(TreeNode root, int x,int y)
    {
        if(root==null)
            return false;
        boolean check=false;
        if(root.left!=null && root.right!=null)
            check=(root.left.val==x && root.right.val==y)||(root.left.val==y && root.right.val==x);
        return(check||(parent(root.left,x,y))||(parent(root.right,x,y)));
    }
}
