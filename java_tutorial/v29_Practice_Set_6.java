import java.util.Scanner;

public class v29_Practice_Set_6
{
    public static void main(String[] args) {
/*       Create an array of 5 floats and calculate their sum.*/
//        float []a={45.5f,25.5f,36.2f,10.5f,95.5f};
//        float sum=0;
//        for (float element:a)
//        {
//            sum=sum+element;
//        }
//        System.out.println("The value od sum is "+ sum);

/*       Write a program to find out whether a given integer is present in an array or not.*/
//        float []a={45.5f,25.5f,36.2f,10.5f,95.5f};
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Array:-45.5f, 25.5f, 36.2f, 10.5f, 95.5f");
//        System.out.println("enter the Array ");
//        float num=sc.nextFloat();
//
//        boolean isInArray=false;
//        for (float element:a)
//        {
//            if (num==element)
//            {
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray)
//        {
//            System.out.println("The value is present in the array");
//        }
//        else
//        {
//            System.out.println("The value is not present in the array");
//        }

       /* Calculate the average marks from an array containing marks of all students in physics using a for-each loop.*/
//        float []a={45.5f,25.5f,36.2f,95.5f,95.5f};
//        float sum=0;
//        for (float element:a)
//        {
//            sum=sum+element;
//        }
//        System.out.println("The value of average marks is "+ sum/a.length);

       /* Create a Java program to add two matrices of size 2x3.*/
//        int [][] mat1={{1, 2, 3},
//                      {4, 5, 6}};
//        int [][] mat2={{2, 6, 13},
//                      {3, 7, 1}};
//        int [][] resul={{0, 0, 0},
//                      {0, 0, 0}};
////        for(int element:mat1)
//        for(int i=0; i<mat1.length; i++)
//        {
//            for (int j=0; j<mat1[i].length;j++)
//            {
////                System.out.printf("Setting value for i=%d and j=%d\n",i,j);
////                System.out.println("");
//                resul[i][j]=mat1[i][j] + mat2[i][j];
//                System.out.print(resul[i][j]+" ");
//            }
//            System.out.println("");
//        }

       /* Write a Java program to reverse an array.*/
//        int [] arr = {1, 21, 3, 4, 5, 34, 67};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//
//        for(int i=0; i<n; i++){
//            // Swap a[i] and a[l-1-i]
//            // a   b   temp
//            // |4| |3| ||
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//        for(int element: arr){
//            System.out.print(element + " ");
//        }

        /*Write a Java program to find the maximum element in an array.*/
//        int [] arr = {1, 210, 3, 455, 5, 34, 67};
//        int max = Integer.MIN_VALUE;
//        for(int e: arr){
//            if(e>max){
//                max = e;
//            }
//        }
//        System.out.println("the value of the miniimum element in this array is: "+ max);

        /*Write a Java program to find the maximum element in a Java array.*/
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        int [] arr = {1, 210, 3, 455, 5, 34, 67};
//        int min = Integer.MAX_VALUE;
//        for(int e: arr){
//            if(e<min){
//                min = e;
//            }
//        }
//        System.out.println("the value of the miniimum element in this array is: "+ min);

        /*Write a Java program to find whether an array is sorted or not.*/
        boolean isSorted = true;
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1])
            {
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }
    }
}
