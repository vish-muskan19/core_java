public class v32_method_overloading
{
        static void foo() {
            System.out.println("Good Morning bro!");
        }

        static void foo(int a) {
            System.out.println("Good morning " + a + " bro!");
        }

        static void foo(int a, int b) {
            System.out.printf("Good morning %d and %d",a,b);
//            System.out.println("Good morning " + b + " bro!");
        }

        static void foo(int a, int b, int c) {
            System.out.print("Good morning " + a + " bro!");
            System.out.println("Good morning " + b + " bro!");
        }

        public static void main(String[] args) {
            // Method Overloading
            foo();
            foo(3000);
            foo(3000, 4000);
            // Arguments are actual!


        }
    }
