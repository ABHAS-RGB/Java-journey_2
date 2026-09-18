class A {
    public int harry(){
        return 2;
    }
    public void meth2(){
        System.out.println("i am method of 2 of class A");
    }
}
class b extends A{
    @Override
    public void meth2(){
        System.out.println("i am method 3 of derived class of A after method overriding");
    }
    public void meth3(){
        System.out.println("i am method 3 of derived class of A");
    }
}
public class day12_method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        b B = new b();
        B.meth2();

    }
}
