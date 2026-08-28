public class Day_3_Methodoverloading {
//    static void telljoke(){
//        System.out.println("haa haa haa haa");
//    }
//    static void change(int []arr){
//        arr[0]=1;
//    }
    static void wish(){
        System.out.println("good morning broo");
    }static void wish(int a){
        System.out.println("good morning broo" + " love you" +a);
    }
    public static void main(String[] args) {
// when there is nothing to return we use void class
    //telljoke();
//    int [] marks ={11,22,333,69,6,9};
//    change(marks);
//        System.out.println(marks[0]);
        // in case of aarray the refrence is passed thats why the value changes
// methods overloadding
        // arguments are actucal
wish();
wish(300);
//method overloadding cantnot be performed by changging return type

    }
}
