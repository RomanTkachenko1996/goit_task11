import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Метод приймає на вхід список рядків (можна взяти список із Завдання 1).
 * Повертає список цих рядків у верхньому регістрі, і відсортованих за спаданням (від Z до A).
 */
public class Task2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan","Peter","Mike","Polly","Jolly","Fred","Rick","Duke","Kate");
        List<String> result = names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("result = " + result);
    }
}
