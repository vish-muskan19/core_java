package java_tutorial;
public class v15_ps3
{
    public static void main(String[] args) {
//        Write a Java program to convert a string to lowercase.
        String name="Jack parker";
        name=name.toLowerCase();
        System.out.println(name);

//        Write a Java program to replace spaces with underscores
        String text="To Lower case";
        text=text.replace(" ","_");
        System.out.println(text);

//        Write a Java program to fill in a letter template which looks like below:
//        letter = “Dear <|name|>, Thanks a lot”
//        Replace <|name|> with a string (some name)
        String letter="Dear <|name>|, thanks a lot!";
        letter.replace("<|name>|","muskan");  //error
        letter=letter.replace("<|name>|","muskan");
        System.out.println(letter);

//        Write a Java program to detect double and triple spaces in a string.
        String myString="this string contains  double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("    ")); //spaces 4  = -1

//        Write a program to format the following letter using escape sequence characters.
//        Letter = “Dear Harry, This Java Course is nice. Thanks”
        String myLetter = "Dear Harry,\n\t This Java Course is nice.\n Thanks";
        System.out.println(myLetter);
    }
}
