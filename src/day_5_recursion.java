public class day_5_recursion {
//    static int factorial(int n){
//// factorial n = n*n-1*n-2........1
//        if (n==0 || n==1){
//            return 1;
//        }
//        else {
//            return n * factorial(n-1);
//        }
    static int fibonachi(int n){
        if (n==1){
            return 0;
        } else if (n==2) {
            return 1;
        }
        else {
            return fibonachi(n-1) + fibonachi(n-2);
        }
    }
    public static void main(String[] args) {
        int x = 10;
        System.out.println("the value of n " + fibonachi(x));

    }
}
