package java_tutorial;

public class v10_resulting_data_type
{
    public static void main(String[] args) {

//        byte x=5;
//        int y=6;
//        short z=8;
//        float b = 6.54f + x;
//        System.out.println(b);    //11.54

        // Increment and Decrement Operators
        int i=56;
        int b=i++;  // first b is assigned i (56) then i is incremented
        System.out.println(i++);  //56
        System.out.println(i);    // 57
        System.out.println(b);  //56
        System.out.println(++i);  //59
//
//        int j=68;
//        int c=++j; // first j is incremented then c is assigned j (68)
//        System.out.println(c); //69
//        System.out.println(++c);  //70

        int y = 7;
        System.out.println( ++y *8);
        char ch = 'a';
        System.out.println(++ch);
    }
}
