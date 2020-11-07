package less7;

public class Two {
    public static void main(String[] args) {
        // O(log(n)) - n раз сделать операцию с такой вот сложностью | n = N/2

        int index = interpolationSearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 6);
    }

    private static int interpolationSearch(int[] ints, int elementToSearch) {
        int startIndex = 0;
        int lastIndex = ints.length - 1;

        while (
                (startIndex <= lastIndex) && (elementToSearch >= ints[startIndex]) && (elementToSearch <= ints[lastIndex])
        ) {
            // index = 0 + (8-0) / (9-1) * (7-1) = 6;
            int pos = startIndex + (((lastIndex - startIndex) / (ints[lastIndex] - ints[startIndex])) * (elementToSearch - ints[startIndex]));

            if (ints[pos] == elementToSearch) {
                return pos;
            }

            if (ints[pos] < elementToSearch) {
                startIndex = pos + 1;
            } else {
                lastIndex = pos - 1;
            }

        }
        return -1;
    }
}
