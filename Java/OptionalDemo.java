import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        String name = null;

        Optional<String> optName = Optional.ofNullable(name);

        // optName.ifPresent((s) -> System.out.println(s.toUpperCase()));
        // optName.orElse("no value present");

        optName.ifPresentOrElse((s) -> System.out.println(s.toUpperCase()), () -> System.out.println("no value present"));
        optName.orElseThrow(() -> new RuntimeException("Value cannot be null."));
        optName.orElseThrow(NullPointerException::new);

        // if (name != null)
        //     System.out.println(name.toUpperCase());
        // else
        //     System.err.println("no value present.");

    }

}
