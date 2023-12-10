package java_tutorial;

@FunctionalInterface
interface myFunctionalInteface {
    void thisMethod();
//    void thisMethod2();
}
class NewPhone extends phone{
    @Override
    public void showTime(){
        System.out.println("Time is 8 PM");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}

public class v108_java_annotations
{
    public static void main(String[] args) {
        @SuppressWarnings("Deprecated")
        NewPhone phone= new NewPhone();
        phone.showTime();
        phone.sum(5,6);

    }
}
