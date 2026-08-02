public class Calculator {

    public static double average(int[] numbers) {
        int sum = 0;

        for (int n : numbers) {
            sum += n;
        }

        // BUG: integer division truncates the result
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        int[] values = {1, 2};

        System.out.println(average(values));
    }
}
