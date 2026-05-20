// User function Template for Java
class Solution {
    public List<Integer> twoSum(int arr[], int target) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            int comp= target - arr[i];
            
            if(map.containsKey(comp)){
                list.add(comp);
                list.add(arr[i]);
                return list;
            }
            map.put(arr[i], i);
        }
        return list;
    }
}


        