package Optionals;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object o = Optional.ofNullable(null)
                .orElseGet(() -> "default value");

        System.out.println(o);

        Object o1 = Optional.ofNullable("Hi")
                .orElseThrow(IllegalStateException::new);
        System.out.println(o1);

        Optional.ofNullable(null)
                .ifPresent(System.out::println);

        Optional.ofNullable("john@gmail.com")
                .ifPresentOrElse(
                        System.out::println,
                        () -> {
                            System.out.println("Cannot send email");
                        });


    }
}
