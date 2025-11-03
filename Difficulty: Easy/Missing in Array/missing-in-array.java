class Solution {
    int missingNum(int arr[]) {
        // code here
        int N = arr.length;
        int sum1=0;
        int sum2=0;
        int missingEle = 0;
        for(int i=0; i<N; i++){
            sum1+=arr[i];
        }
        for(int i=0; i<N+2; i++){
            sum2+=i;
        }
        
        missingEle = sum2 - sum1;
        
        return missingEle;
    }
}