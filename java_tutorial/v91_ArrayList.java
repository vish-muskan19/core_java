package java_tutorial;

import java.util.*;
import java.lang.reflect.Array;

public class v91_ArrayList
{
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>(5);

        l2.add(4);
        l2.add(5);
        l2.add(6);

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(6);

        l1.add(0,6);
        l1.add(0,7);

        l1.addAll(l2);

        System.out.println(l1.contains(71));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        l1.set(1,45);

//        l1.clear();

        for (int i=0; i<l1.size(); i++)
        {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

        System.out.println("\n");

        ArrayList<String> list=new ArrayList<String>();
        list.add("ashen");
        list.add("avi");
        list.add("knk");
        list.add("anuu");
        list.add("karuna");

        Iterator itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
