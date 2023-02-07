import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Є масив:
 *
 * ["1, 2, 0", "4, 5"]
 *
 * Необхідно отримати з масиву всі числа, і вивести їх у відсортованому вигляді через кому ,, наприклад:
 *
 * "0, 1, 2, 4, 5"
 */
public class Task3 {
    public static void main(String[] args) {
       String[] array = new String[]{"1, 2, 0", "4, 5"};
        String result = Arrays.stream(array)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
