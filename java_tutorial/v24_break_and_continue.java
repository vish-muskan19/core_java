package java_tutorial;

public class v24_break_and_continue {
    public static void main(String[] args) {
//        for (int i=0; i<5; i++)
//        {
//            System.out.println(i);
//            if(i==2)
//            {
//                System.out.println("ending the loop");
//                break;
//            }
//        }
//        int i=0;
//        while (i<5)
//        {
//            System.out.println(i);
//            if(i==2)
//            {
//                System.out.println("ending the loop");
//                break;
//            }
//            i++;
//        }
//        do {
//            System.out.println(i);
//            if(i==2)
//            {
//                System.out.println("ending the loop");
//                break;
//            }
//            i++;
//        }while (i<5);

//        continues

//        for(int i=0;i<50;i++)
//        {
//            if(i==2)
//            {
//                System.out.println("end the loop");
//                continue;
//            }
//            System.out.println(i);
//        }

//        int i=0;
//        do {
//            i++; // i=1 increment
//            if(i==2)
//            {
//                System.out.println("ending the loop");
//                continue; //2
//            }
//            System.out.println(i);
//        }while (i<5);

        int i=0;
        while (i<5)
        {
            i++;
            if(i==2)
            {
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(i);
        }
    }

}
