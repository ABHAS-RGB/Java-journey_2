public class day_5_method_parctice {
    //public static void main(String[] args) {
//    static void table(int n){
//        for (int i=1;i<=10;i++){
//            System.out.format("%d X %d =%d\n" , n , i,n*i);
//        }
//    }
//    public static void main(String[] args) {
//        // problem 1
//        table(7);
//
//    }
//    //print pattern *
//    //              **
//    //              ***
//    //              ****
//
//    static void patern1(int x){
//     for (int i=0;i<x;i++){
//         for (int j =0 ;j<i+1;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//    }
//patern1(4);
//}
// question 3
// write a recursive program to find sum of n natural number
//    static int sumn(int n){
//        //base condition
//        if ( n== 1){
//            return 1 ;
//        }
//        return n + sumn(n-1);
//
//        }
//
//public static void main(String[] args) {
//    int c =sumn(3);
//    System.out.println(" sum of 3 natural number is " + sumn(c));
//}
    /*
    question 5
    print the pattern of ****
                         ***
                         **
                         *

    static void pattern2(int n){
        for (int i =0;i<n;i++ ){
            for (int j =n;j>i;j-- ){
                System.out.print("8");
            }
            System.out.println();
        }
    }
    }

     */
    // question 6
    // fibonachi series
//    static int fibonachi2(int n) {
//        if (n==1){
//            return 0;
//        }
//        else if (n==2) {
//            return 1;
//        } else {
//            return fibonachi2(n-1) +fibonachi2(n-2);
//        }
//
//
//    }
/*
question 7
find the averqage of set of number using agruments
 */

//static int av( int ... arr){
//    int res = 0;
//    for (int a: arr){
//        res += a;
//    }
//
//}
//static float av(int ... arr){
//    float result =0;
//    for (float a:arr){
//        result = result+a;
//    }
//    return = (result/arr.length);
//}
//static int avg(int ...arr){
//    int result=0;
//    for(int element:arr){
//        result = result+element;
//    }
//    return (result/arr.length);
//}
//
//    public static void main(String[] args) {
//        System.out.println(" the numbers are " + avg(22,66,77,888,20,96,30));
//    }





}