public class Reverse {

    public static void main(String[] args) {
        // Reverse a number
        int n = 123456789;
        int ans = reverse(n);
        System.out.println(ans);
    }
    static int reverse(int n){
        int ans = 0;
        while(n>0){
            int rem = n%10;
            ans = ans*10+rem;
            n=n/10;
        }
        return ans;
    }
}
