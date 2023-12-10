package java_tutorial;

import java.util.ArrayList;


class MyGenerics<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGenerics(int val, T1 t1,T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}
public class v110_generics {
    public static void main(String[] args) {
//        ArrayList arrayList=new ArrayList();
//        arrayList.add("str");
//        arrayList.add(15);
//        arrayList.add(63);
//        int array =(int) arrayList.get(2);
//        System.out.println(array);

        MyGenerics<String,Integer> g1=new MyGenerics(6,"MyString is my sting ",65);
        String str=g1.getT1();
        Integer int1=g1.getT2();
        System.out.println(str + int1);
    }
}
