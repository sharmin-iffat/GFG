class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(prices);
        int i=0, j = prices.length-1;
        int cost = 0;
        while(i<=j){
            cost +=prices[i];
            i++;
            j-=k;
        }
        list.add(cost);
        
        i=0;
        j = prices.length-1;
        cost = 0;
        while(i<=j){
            cost +=prices[j];
            j--;
            i+=k;
        }
        list.add(cost);
        
        return list;
        
    }
}
