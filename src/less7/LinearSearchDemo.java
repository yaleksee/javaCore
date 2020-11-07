package less7;

public class LinearSearchDemo {
    public static void main(String[] args) {
        int[] integerArray = {100, 122, 354, 456, -24, 45, -8, 0, 15, 123};
        int[] integerArray2 = {-100, 12, 234, 400, 554, 656, 1230};
        int elementToFind = 234;
        System.out.println(elementToFind + " index: " + linerSearch(integerArray, elementToFind));
        System.out.println(elementToFind + " index: " + binarySearch(integerArray2, elementToFind, 0, integerArray.length - 1));
    }

    private static int binarySearch(int[] integerArray, int elementToFind, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (elementToFind < integerArray[mid]) {
            return binarySearch(integerArray, elementToFind, low, mid - 1);
        } else if (elementToFind > integerArray[mid]) {
            return binarySearch(integerArray, elementToFind, mid + 1, high);
        } else {
            return mid;
        }
    }

    private static int linerSearch(int[] integerArray, int elementToFind) {
        int arraySize = integerArray.length;
        for (int i = 0; i < arraySize; i++) {
            if (integerArray[i] == elementToFind) {
                return i;
            }
        }
        return -1;
    }

    // O(n)

}
