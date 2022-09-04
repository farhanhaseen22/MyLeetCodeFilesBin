// class countingGoodNodes {

//     public class TreeNode {
//         int val;
//         TreeNode left;
//         TreeNode right;
        
//         TreeNode() {}

//         TreeNode(int val){
//             this.val = val;
//         }
        
//         TreeNode(int val, TreeNode left, TreeNode right) {
//             this.val = val;
//             this.left = left;
//             this.right = right;
//         }
//     }

//     public int goodNodes(TreeNode root) {
//         if(root == null){ return 0; }
//         int count = 1;
        
//         count += dfs(root.left, root.val);
//         count += dfs(root.right, root.val);
//         return count;
//     }
    
//     public int dfs(TreeNode root, int currentMax){
        
//         int amount = 0; 
//         if(root == null){ return 0; }
//         if(root.val >= currentMax){
//             amount++; 
//             currentMax = root.val;
//         }
        
//         amount += dfs(root.left, currentMax);
//         amount += dfs(root.right, currentMax);
//         return amount; 
//     }

//     public static void main(String[] args) {
//         countingGoodNodes ts1 = new countingGoodNodes();
//         int[] nums = {3,1,4,3,0,1,5};
        
//         for (int i = 0; i < nums.length; i++) {
//             TreeNode tNode = new TreeNode(nums[i]);
//         }
        
//         int result = ts1.goodNodes(tNode);

//         System.out.println();
//         System.out.println("-------");
//         System.out.println();
//         System.out.println(result);
//     }
// }
