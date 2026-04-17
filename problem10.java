class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();
        if(root == null)
        return result ;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer>level = new ArrayList<>();
            for(int i = 0; i < size; i++){
             TreeNode treenode = queue.poll();
                level.add(treenode.val);

                if (treenode.left != null)
                    queue.add(treenode.left);

                if (treenode.right != null)
                    queue.add(treenode.right);
            }

            result.add(level);
        }

        return result;
    }
}
