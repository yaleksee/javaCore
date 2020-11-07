package less7;

public class One {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int max = search(array);
        System.out.println(max);
    }

    // f(n) = 4 + 2n + 4n = 6n + 4 -> = n
    // f(n) = n^2 + 10n + 100 -> n^2
    // f(n) = 1



    private static int search(int[] ints) { // 4 + 2n
        int max = ints[0];
        int n = ints.length;
        for (int i = 0; i < n; i++) {
            if (ints[i] > max) {
                max = ints[i];
            }
        }
        return max;
    }
}
