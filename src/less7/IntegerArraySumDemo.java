package less7;

public class IntegerArraySumDemo {
    public static void main(String[] args) {
        int[] ints = {10, 6, 7, 8, 4, 5, 3, 6, 5, 0};
        int sum = 0;
        // O(n)

        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }

        System.out.println(sum);


        // O(1)
        int index = 5;

        if (index < ints.length) {
            int element = ints[index];
            System.out.println(element);
        }

    }
}
