import java.util.*;
import java.util.stream.Stream;

/**
 * Напишіть метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
 * який "перемішує" елементи зі стрімів first та second, зупиняючись тоді,
 * коли у одного зі стрімів закінчаться елементи.
 */
public class Task5 {
    private static Stream<String> zip(Stream<String> stream1, Stream<String> stream2) {
        List<String> strings = new ArrayList<>(Stream.concat(stream1, stream2).toList());
        Collections.shuffle(strings);
        return strings.stream();
    }
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("a", "c", "e","g");
        Stream<String> stream2 = Stream.of("b", "d", "f");
        System.out.println("zip(stream1,stream2).toList() = " + zip(stream1, stream2).toList());
    }
}
