import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        int ans = helper(n);
        
        System.out.print(ans);
    }
    private static int helper(int n){
        if(n == 0) return 0;
        
        return n + helper(n-1);
    }
}