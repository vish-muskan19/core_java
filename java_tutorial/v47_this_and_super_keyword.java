package java_tutorial;

class this_keyword{
    int a;

    public int getA() {
        return a;
    }
    public this_keyword(int v) {
        this.a = v;
//        this.a = a; //varible name same h to (this keyword) use krege references
//        a = a; // output 0
    }
    public int returnOne(){
        return 1;
    }
}
class super_keyword extends this_keyword{
    super_keyword(int c){
        super(c);
        System.out.println("I am a construction");
    }
}
public class v47_this_and_super_keyword {
    public static void main(String[] args) {
        this_keyword e=new this_keyword(5);
        System.out.println(e.getA());

        super_keyword s=new super_keyword(65);
        System.out.println(s.getA());
    }
}
