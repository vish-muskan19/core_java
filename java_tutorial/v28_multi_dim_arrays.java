package java_tutorial;

public class v28_multi_dim_arrays {
    public static void main(String[] args) {

        int[][][] flats; // A 2-D Array
        flats = new int[2][3][4]; //2*3*4=24

        flats[0][0][0] = 101;
        flats[0][0][1] = 102;
        flats[0][0][2] = 103;
        flats[0][0][3] = 104;

        flats[0][1][0] = 201;
        flats[0][1][1] = 202;
        flats[0][1][2] = 203;
        flats[0][1][3] = 204;

        flats[0][2][0] = 301;
        flats[0][2][1] = 302;
        flats[0][2][2] = 303;
        flats[0][2][3] = 304;

        flats[1][0][0] = 401;
        flats[1][0][1] = 402;
        flats[1][0][2] = 403;
        flats[1][0][3] = 404;

        flats[1][1][0] = 501;
        flats[1][1][1] = 502;
        flats[1][1][2] = 503;
        flats[1][1][3] = 504;

        flats[1][2][0] = 601;
        flats[1][2][1] = 602;
        flats[1][2][2] = 603;
        flats[1][2][3] = 604;

        // Displaying the 2-D Array (for loop)
        System.out.println("Printing a 2-D array using for loop");
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                for (int x = 0; x < 4; x++)
                {
                    System.out.print(flats[i][j][x]);
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }
}