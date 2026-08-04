class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int i=0, j=0, k=0;
        
        int  l=a.length, m=b.length, n=c.length;
        
        while(i<l && j<m && k<n){
            if(a[i] == b[j] && a[i] == c[k]){
                list.add(a[i]);
                int val = a[i];
                
                while(i < l && a[i] == val) i++;
                
                while(j < m && b[j] == val)j++;
                while(k < n && c[k] == val)k++;
            }else{
                int min = Math.min(a[i], Math.min(b[j], c[k]));
                if(a[i] == min) i++;
                if(b[j] == min) j++;
                if(c[k] == min) k++;
            }
            
        }
        return list;
        
    }
}