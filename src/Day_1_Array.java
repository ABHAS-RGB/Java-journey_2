

public class Day_1_Array {
    public static void main(String[] args) {
        /*
        for storing 500 people data either use 500 variable X or we can use array(recommended)
        syntax data type name [] name = new DT [5] = memory allocation
        it is best for accessing
        array is an object!!
         */
//        String[]Subject_names = new String [5];
//        Subject_names[0]= "maths";
//        Subject_names[1]= "Science";
//        Subject_names[2]= "Biology";
//        Subject_names[3]= "Computer";
//        Subject_names[4]= "Geography";
//        System.out.println(Subject_names);

//        float[]marks ={ 11,20,15.3f,36,66};
       /*
       operation on array
       1. Lenght

        //System.out.println(marks.length);
        // String        // [] names = {"abhas","lucky","adarsh"};
        //System.out.println(names[2]);
*/
        // for loop for displaying
//        int[]marks ={ 11,20,15,36,66};
//        for(int i=0;i<marks.length;i++);{
//            System.out.println(marks[1]);
//        }
        // reverse order
//        for (int i = marks.length - 1 ; i>=0 ; i--){
//            System.out.println(marks[i]);
//       }
        // for each loop
//        for (int element : marks){
//        System.out.println(element);}
        /*
         multidimensional array
         stored in array
         syntax 2-D array DT[][] name
         */
        int [][]flat = new int[2][3];
        flat[0][0] = 101;
        flat[0][1] = 102;
        flat[0][2] = 103;
        flat[1][0] = 201;
        flat[1][1] = 202;
        flat[1][2] = 203;
        for (int i=0; i< flat.length;i++) {
            for (int j = 0; j<flat[i].length; j++) {
                System.out.println(flat[i][j]);
                System.out.println(" ");
            }
            System.out.println("");
        }

    }
}
