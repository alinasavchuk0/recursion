public class RecursionExample {

    // Рекурсивний метод для обчислення суми чисел від 1 до n
    public static int sum(int n) {
        // Базовий випадок
        if (n == 1) {
            return 1;
        }

        // Рекурсивний виклик
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Сума від 1 до " + number + " = " + sum(number));
    }
}
