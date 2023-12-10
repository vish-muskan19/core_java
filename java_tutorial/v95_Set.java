package java_tutorial;

import java.util.HashSet;

public class v95_Set {
    public static void main(String[] args) {
        HashSet<Integer> h1=new HashSet<>(5,0.2f);

        h1.add(11);
        h1.add(22);
        h1.add(33);
        h1.add(44);
        h1.add(55);
        h1.add(55); // This element will be ignored

        System.out.println(h1);

        h1.remove(33); //deletes 33 from the hashset
        System.out.println(h1);

        System.out.println(h1.size()); //Printing the size of the HashSet :

        HashSet<Integer> h2=new HashSet<>();

        System.out.println(h1.isEmpty());  //Checking if the HashSet is empty or not :
        System.out.println(h2.isEmpty());

        h1.clear(); //deletes all the elements from the hashset
        System.out.println(h1);

//        System.out.println(h1.size());
    }
}
