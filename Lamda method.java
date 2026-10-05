import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class LambdaExample {
    public static void main(String[] args) {
        
        // 1. Iterating over a collection (Consumer interface)
        List<String> names = List.of("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println("Hello, " + name));

        // 2. Lambda with multiple parameters & return value (BiFunction interface)
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Sum: " + add.apply(10, 20));

        // 3. Multiline Lambda body
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> {
            System.out.println("Multiplying " + a + " and " + b);
            return a * b;
        };
        System.out.println("Product: " + multiply.apply(5, 4));
    }
}