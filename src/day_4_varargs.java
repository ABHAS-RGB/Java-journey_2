public class day_4_varargs {
//    static int sum(int a ,int b){
//        return a+b;
//    }
    static int sum(int x ,int ...arr){
//        int result = 0; for compulsory arguments
        int result = x;
        for (int a: arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("the ssum of 4, 5  " + sum(4,5) );
        System.out.println("the sum of 4 ,4,44,55,5,7,88" + sum(4,5));
    }
}
