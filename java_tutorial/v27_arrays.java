public class v27_arrays {
    public static void main(String[] args) {
        int []marks={98,45,79,99,80};
//        System.out.println(marks.length);

        // Displaying the Array (Naive way)
        System.out.println("printing using naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the Array (for loop)
//        System.out.println("printing using for loop");
//        for(int i=0;i<=marks.length;i++)
//        {
//            System.out.println(marks[i]);
//        }

        // quick quiz: Displaying the Array in Reverse order ( for loop)
        System.out.println("printing using for loop in reverse oder");
        for (int i= marks.length-1;i>=0;i--)
        {
            System.out.println(marks[i]);
        }

       // Displaying the Array (for-each loop)
        System.out.println("printing using for-each loop");
        for(int element:marks)
        {
            System.out.println(element);
        }
    }
}
//    int[][][] intArray = new int[10][20][10]; //a 3D array
//String[][][] arr = new String [2][3][4]