// User function Template for Java

class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        // code here
        Vector<Integer> v = new Vector<>();
        int n =arr.length-1;
        int carry =0;
        
        if(arr[n] == 9){
            v.add(0);
            carry = 1;
            for(int j = n-1; j>=0; j--){
                int sum = arr[j] + carry;
                if(sum >= 10){
                    v.add(0);
                    carry =1;
                }else{
                    v.add(sum);
                    carry = 0;
                }
            }
            if(carry > 0) v.add(carry);
            
            
        }else{
            v.add(arr[n] +1);
            for(int j = n-1; j>=0; j--){
                v.add(arr[j]);
            }
        }
        Collections.reverse(v);
        
        return v;
    }
}