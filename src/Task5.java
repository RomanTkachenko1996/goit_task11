import java.util.*;
import java.util.stream.Stream;

/**
 * Напишіть метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
 * який "перемішує" елементи зі стрімів first та second, зупиняючись тоді,
 * коли у одного зі стрімів закінчаться елементи.
 */
public class Task5 {
    private static <T> Stream<T> zip(Stream<T> stream1, Stream<T> stream2) {
        List<T> list = new ArrayList<>();
        Iterator<T> iterator1 = stream1.iterator();
        Iterator<T> iterator2 = stream2.iterator();
        while(iterator1.hasNext() && iterator2.hasNext()){
            list.add(iterator1.next());
            list.add(iterator2.next());
        }
        return list.stream().peek(System.out::println);
    }
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("a", "c", "e","g");
        Stream<String> stream2 = Stream.of("b", "d", "f");
        List<String> listOfString = zip(stream1, stream2).toList();

    }
}
