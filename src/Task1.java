import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


/**
 * Метод приймає на вхід список імен.
 * Необхідно повернути рядок вигляду 1. Ivan, 3. Peter... лише з тими іменами,
 * що стоять під непарним індексом (1, 3 тощо)
 */
public class Task1 {
    public static void main(String[] args) {
       List<String> names = Arrays.asList("Ivan","Peter","Mike","Polly","Jolly","Fred","Rick","Duke","Kate");
        List<String> result = IntStream.range(0, names.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> i + ". " + names.get(i))
                .toList();
        System.out.println("result = " + result);
    }
}
