
class Solution {
    public String findLargest(int[] arr) {
        
        // Convert int array to String array
        String[] str = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            str[i] = String.valueOf(arr[i]);
        }
        
        // Sort using custom comparator
        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));
        
        // If largest element is 0, return 0
        if (str[0].equals("0")) {
            return "0";
        }
        
        // Build final result
        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s);
        }
        
        return sb.toString();
    }
}