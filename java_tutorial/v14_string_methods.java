package java_tutorial;

public class v14_string_methods {
    public static void main(String[] args) {
//        String a1=new String("muskan");
        String name="muskan";
//        System.out.println(name);

//        int value=name.length();
//        System.out.println(value);
//
//        String lstring=name.toLowerCase();
//        System.out.println(lstring);
//
//        String ustring=name.toUpperCase();
//        System.out.println(ustring);
//
//        String nonTrimmed="     muskan     ";
//        System.out.println(nonTrimmed);
//        String trimmedstring=nonTrimmed.trim();
//        System.out.println(trimmedstring);

//        System.out.println(name.substring(2));
//        System.out.println(name.substring(0));
//        System.out.println(name.substring(1,4));
//
//        System.out.println(name.replace('k','m'));
//        System.out.println(name.replace("a","oi"));
//
//        System.out.println(name.startsWith("mus"));
//        System.out.println(name.startsWith("kan"));
//        System.out.println(name.endsWith("an"));
//        System.out.println(name.endsWith("a"));

//        System.out.println(name.charAt(0));
//        System.out.println(name.charAt(2));

        String modifiedName="muskanmuskan";
        System.out.println(modifiedName.indexOf("ka"));
        System.out.println(modifiedName.indexOf("ka456466"));
        System.out.println(modifiedName.indexOf("us",5));

        System.out.println(modifiedName.lastIndexOf("kan"));
        System.out.println(modifiedName.lastIndexOf("kan",6));

        System.out.println(name.equals("muskan"));
        System.out.println(name.equals("Muskan"));

        System.out.println(name.equalsIgnoreCase("MusKan"));

        System.out.println("I an escape squence \"double quote\"");
        System.out.println("I an escape squence \n double quote");
        System.out.println("I an escape squence \t double quote");
        System.out.println("I an escape squence \\ double quote");
    }
}
