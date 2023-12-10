package java_tutorial;

import java.util.LinkedList;

public class v92_linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 =new LinkedList<>();
        LinkedList<Integer> l2 =new LinkedList<>();

        l2.add(4);
        l2.add(5);
        l2.add(6);

        l1.add(1);
        l1.add(2);
        l1.add(3);

        l1.addAll(l2);

        l1.add(0,44);
        l1.add(0,6);
        System.out.println("L1 listed list "+l1);

        l1.remove(2);
        System.out.println("L1 Linked list after: "  + l1);

        l1.set(2,11); //changes element present at 2nd index (3 changed to 11)
        System.out.println("L1 Linked list change: "  + l1);

        l1.addLast(100); //Inserting 100 at the end of L1
        System.out.println("L1 Linked list after inserting element at last index: "  + l1);

        l1.addFirst(0); //Inserting 0 at the starting of L1
        System.out.println("L1 Linked list after: "  + l1);

        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));

        for(int i=0; i<l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
