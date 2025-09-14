public class Fibonacci {
    public static void main(String[] args) {
        // Fibonnaci Series

        int n = 6;
        System.out.println(Fibo(n));
    }
    static int Fibo(int n){
        int a =0;
        int b = 1;
        int ans =2;
        while(ans<=n){
            int temp = b;
            b= b+ a;
            a = temp;
            ans++;
        }
        return b;
    }
}
