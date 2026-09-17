class base{
    int x;
    public void printme(){
        System.out.println("i am constructor ");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("i am x  now");
        this.x = x;
    }
}

class Derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class day_11_inheritance {
    public static void main(String[] args) {
        Derived b = new Derived();
        b.setX(4);
        b.setY(5);
        System.out.println(b.getX());
        System.out.println(b.getY());


    }
}
