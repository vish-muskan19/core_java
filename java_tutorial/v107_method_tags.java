package java_tutorial;

/**
 * This is a good class
 */
public class v107_method_tags {
    /**
     *
     * @param args These are argument supplied to the command Line
     */
    public static void main(String[] args) {
        System.out.println(" This is a main method");
    }

    /**
     * Hello this is a method and this is most imp method abd class
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return Sum of two number as an integer
     * @throws Exception if i is 0
     * @deprecated This method is deprecated please use + Operator
     */

    public int add(int i, int j) throws Exception {
        if (i == 0) {
            throw new Exception();
        }
        int c;
        c = i + j;
        return c;
    }

}
