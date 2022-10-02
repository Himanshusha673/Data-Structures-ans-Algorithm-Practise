public class Fibbonacci {
    public static  int fib(int n) {
        if(n==0){ return 0;}
        int prev =0;
        int curr= 1;
        for(int i=2;i<=n;i++){
            int res=curr+prev;
            prev=curr;
            curr=res;
        }
        return curr;
    }
    public static void main(String[] args) {
        System.out.println(fib (5));
    }
}
