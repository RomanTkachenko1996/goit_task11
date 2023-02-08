import java.util.stream.Stream;

/**
 * Використовуючи Stream.iterate, створіть безкінечний стрім випадкових чисел, але не використовуючи Math.random().
 *
 * Реалізуйте свій лінійний конгруентний генератор. Для цього почніть з x[0] = seed,
 * і далі кожний наступний елемент рахуйте за формулою на зразок x[n + 1] = 1 (a*x[n] + c) % m для коректних значень a, c, та m.
 *
 * Необхідно імплементувати метод, що приймає на вхід параметри a, c, та m, і повертає Stream<Long>.
 *
 * Для тесту використовуйте такі дані:
 *
 *     a = 25214903917
 *     c = 11
 *     m = 2^48 (2в степені48`)
 */
public class Task4 {
    /**
     * x[n + 1] = 1 (a*x[n] + c) % m
     */
    public static Stream<Long> generateNumber (long seed, long a, long c, long m){
        return Stream.iterate(seed, n->(a*(n+1)+c)%m)
                .mapToLong(aLong -> aLong)
                .boxed();
    }
}

class TestGenerator{
    public static void main(String[] args) {
        long seed = System.currentTimeMillis();
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2,48);
        Task4.generateNumber(seed, a, c, m)
                .limit(10)
                .forEach(System.out::println);
    }
}
