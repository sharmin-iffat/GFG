class Solution {
    /* Returns level of given data value */
    int getLevel(Node root, int target) {
        // Write your code here
        return findLevel(root, target, 1);
    }
    
    int findLevel(Node root, int target, int level){
        if(root == null) return 0;
        
        if(root.data == target) return level;
        
        int left = findLevel(root.left, target, level + 1);
        if(left != 0) return left;
        
        return findLevel(root.right, target, level + 1);
    }
}