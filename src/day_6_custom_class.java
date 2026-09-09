class employee{
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("the name of employee " + name);
        System.out.println("the ID of employee " +  id);
        System.out.println("the salary of employee " +  salary);
    }
}
public class day_6_custom_class {

    public static void main(String[] args) {
        employee abhas = new employee();
        employee adarsh = new employee();
        abhas.id = 07;
        abhas.name = " Abhas Mishra";
        adarsh.id = 12;
        adarsh.name = "Adarsh";
        adarsh.salary = 1200;

        abhas.printdetails();
        adarsh.printdetails();

    }

}
