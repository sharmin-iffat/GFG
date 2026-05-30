class Solution {
    public ArrayList<Integer> mergeThree(int[] a, int[] b, int[] c) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int m= a.length;
        int n= b.length;
        int p= c.length;
        int i=0, j=0, k=0;
        
        while(i<m && j<n && k<p){
            if(a[i] <= b[j] && a[i] <= c[k]){
                list.add(a[i]);
                i++;
            }else if(b[j] <= a[i] && b[j] <= c[k]){
                list.add(b[j]);
                j++;
            }else{
                list.add(c[k]);
                k++;
            }
        }
        while(i<m && j<n){
            if(a[i] <= b[j]){
                list.add(a[i]);
                i++;
            }else{
                list.add(b[j]);
                j++;
            }
        }
        while(j<n && k<p){
            if(b[j] <= c[k]){
                list.add(b[j]);
                j++;
            }else{
                list.add(c[k]);
                k++;
            }
        }
        while(i<m && k<p){
            if(a[i] < c[k]){
                list.add(a[i]);
                i++;
            }else{
                list.add(c[k]);
                k++;
            }
        }
        while(i<m){
            list.add(a[i]);
            i++;
        }
        while(j<n){
            list.add(b[j]);
            j++;
        }
        while(k<p){
            list.add(c[k]);
            k++;
        }
        return list;
    }
}

