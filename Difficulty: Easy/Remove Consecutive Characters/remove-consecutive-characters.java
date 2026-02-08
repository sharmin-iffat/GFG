

class Solution {
    public String removeConsecutiveCharacter(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (stack.isEmpty() || stack.peek() != curr) {
                stack.push(curr);
            }
        }

        // build result from stack
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}
