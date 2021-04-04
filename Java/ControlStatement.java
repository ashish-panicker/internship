import java.util.Scanner;
import java.util.stream.Stream;

public class ControlStatement {

    public static void main(String[] args) {
        // ControlStatement cs = new ControlStatement();
        // cs.arrays();

        // not works with IDE
        String userName = System.console().readLine();

        String password = String.valueOf(System.console().readPassword());

        System.out.printf("Username %s Password %s\n", userName, password);

        int val = Integer.parseInt(new Scanner(System.in).nextLine().trim());

        System.out.println(val);

    }

    public void arrays() {
        String[] names = { "Java", "Javscript", "jQuery", "PLSQL" };

        System.out.println(names.length);
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s ", names[i]);
        }

        for (String name : names) {
            System.out.printf("%s ", name);
        }

        // Stream.of(names).forEach(System.out::println);
        // Java Streams and Lambda

    }

    public void ifStatement() {

        Integer age = 19; // auto-boxing

        Long l;

        Character c;

        Byte b;

        Short s;

        Float f;

        Double d;

        // age >= 18 auto-unboxing

        if (age >= 18) {
            System.out.println("Congrats! you can vote.");
        } else {
            System.err.println("Sorry, you cannot vote.");
        }
    }

    public void switchCase() {
        String grade = "C";

        switch (grade) {
        case "A":
            System.out.println("Excellent");
            break;
        case "B":
            System.out.println("Very good");
            break;
        default:
            System.out.println("Sorry try again..");
            break;
        }
    }

}
