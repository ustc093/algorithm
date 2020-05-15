package leetcode.tree;

import java.util.ArrayList;

/**
 * @Author: 高镇
 * @Date: 2020/5/8 20:05
 */
public class SumValueBinaryTreePath {
    private static ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null){
            return result;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        helper(list,root,target);
        return result;
    }

    private static void helper(ArrayList<Integer> list,TreeNode root,int target) {
        if(root == null){
            return;
        }

        list.add(root.val);


        if(target == root.val){
            result.add(new ArrayList<>(list));
        }

        target -= root.val;
        helper(list,root.left,target);
        helper(list,root.right,target);
        list.remove(list.size()-1);

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode left = new TreeNode(5);
        TreeNode right = new TreeNode(12);
        root.left = left;
        root.right = right;
        left.left = new TreeNode(4);
        left.right = new TreeNode(7);

        ArrayList<ArrayList<Integer>> arrayLists = FindPath(root, 22);
        System.out.println(arrayLists);

    }

}
