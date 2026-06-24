class Solution {
    int stockBuySell(int arr[]) {
        // code here
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        int buy = arr[0];
        int profit = 0;
        
        for(int i=1; i<arr.length; i++){
            if(arr[i] > st.peek()){
                st.push(arr[i]);
            }else{
                profit = profit + (st.peek() - buy);
                
                st.clear();
                st.push(arr[i]);
                buy = arr[i];
                
            }
        }
        profit = profit + (st.peek() - buy);
        return profit;
    }
}
