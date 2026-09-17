class myempolyee2{
    private int id ;
    private String name;
    // constructor
//    public myempolyee2(){
//        id= 7;
//        name = "Code here";
//    }
    public myempolyee2(String myname, int myid){
        id= myid;
        name = myname;
    }

    public void setId(int i){
        id =i;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public String getname(){
        return name ;
    }
}
public class day_9_constructor {
    public static void main(String[] args) {
        myempolyee2 abhas = new myempolyee2("code with me",12);
        System.out.println(abhas.getname());
        System.out.println(abhas.getId());
        // constructor overloading iss allowed

    }
}
