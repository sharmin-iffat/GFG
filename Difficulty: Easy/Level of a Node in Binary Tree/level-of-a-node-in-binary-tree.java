class Solution {
    int getLevel(Node node, int target) {
        return findLevel(node, target, 1);
    }

    int findLevel(Node node, int target, int level) {
        if (node == null) return 0;

        if (node.data == target) return level;

        int left = findLevel(node.left, target, level + 1);
        if (left != 0) return left;

        return findLevel(node.right, target, level + 1);
    }
}