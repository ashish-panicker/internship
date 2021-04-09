import java.util.ArrayList;
import java.util.List;

public class Streams {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        List<String> values = new ArrayList<>();

        names.add("Vaman");
        names.add("Prasad");
        names.add("Ashish");
        names.add("Rahul");
        names.add("Kishore");
        names.add("Ajay");

        values.add("10");
        values.add("1");
        values.add("11");
        values.add("20");
        values.add("31");

        for (String str : values) {
            if(Integer.parseInt(str) % 2 == 0) {
                System.out.println(str);
            }
        }

        values.stream().map(Integer::parseInt).filter(num -> num % 2 == 0).forEach(System.out::println);

        // for (String name : names) {
        // if (name.startsWith("A") && name.contains("h")) {
        // System.out.println(name);
        // }
        // }

        // names.stream().filter(name ->
        // name.startsWith("A")).forEach(System.out::println);

        // List<String> filteredNames = names.stream().filter(name -> name.contains("h")
        // && name -> name.startsWith("A"))
        // .collect(Collectors.toList());

        // filteredNames.forEach(System.out::println);

        // values.stream

        // var filteredNames = names.stream()
        // .filter(name -> name.startsWith("A"))
        // .filter(name -> name.contains("h"))
        // .map(String::toUpperCase)
        // .collect(Collectors.toList());

        // filteredNames.forEach(System.out::println);

    }

}
