import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        int a = 10000000;
        int b = 1000000000;
        long sum = getArithmeticProgressionSum(a, b);
        System.out.println("a = " + a + ", b = " + b + " Ответ: " + sum);

    }

    private static long getArithmeticProgressionSum(int a, int b) {
        if (a >= b) {
            throw new IllegalArgumentException("Неверные входные данные: a должно быть меньше b");
        }

        return LongStream.range(a, b).sum();
    }
}