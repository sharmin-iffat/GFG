class Solution {
    public void sortedMerge(int[] arr1, int[] arr2, int[] res) {
        // code here
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int m = arr1.length;
        int n = arr2.length;
        
        int i=0;
        int j=0;
        int k = 0;
        while(i<m && j<n){
            if(arr1[i] <= arr2[j]){
                res[k] = arr1[i];
                i++;
            }else{
                res[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            res[k] = arr1[i];
            i++;
            k++;
        }
        while(j<n){
            res[k] = arr2[j];
            j++;
            k++;
        }
        
    }
}