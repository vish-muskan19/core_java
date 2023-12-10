package java_tutorial;

import java.util.ArrayDeque;

public class v93_arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> l1=new ArrayDeque<>();
        ArrayDeque<Integer> l2=new ArrayDeque<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);

        l1.addFirst(4);
        l1.offerFirst(5);

        l1.addLast(10);
        l1.offerLast(20);

        System.out.println(l1);

        System.out.println(l1.getFirst());
        System.out.println(l1.peekFirst());

        System.out.println(l1.getLast());
        System.out.println(l1.peekLast());

        l1.pollFirst();
        l1.removeFirst();

        l1.pollLast();
        l1.removeLast();

        System.out.println(l1);
    }
}
