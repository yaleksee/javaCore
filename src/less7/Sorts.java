package less7;

import java.util.Arrays;

public class Sorts {
    public static void main(String[] args) {
        int[] array = {10, 20, 2, 5, 6, 4, 5, 3, 54};


        System.out.println(Arrays.toString(array));

        // bublsort(array);

//        quickSort(array, 0, array.length - 1);

        int[] result = mergeSort(array);

        System.out.println(Arrays.toString(result));
    }

    private static int[] mergeSort(int[] source) {
        int[] buffer1 = Arrays.copyOf(source, source.length);
        int[] buffer2 = new int[source.length];
        return mergeSortInner(buffer1, buffer2, 0, source.length);
    }

    // O(n* log(n))
    private static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {

        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2] ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }


    // 0(n * log(n))
    private static void quickSort(int[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;

        int pivot = source[(leftMarker + rightMarker) / 2];
        do {
            while (source[leftMarker] < pivot) {
                leftMarker++;
            }

            while (source[rightMarker] > pivot) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {
                swap(source, leftMarker, rightMarker);
            }
            leftMarker++;
            rightMarker--;
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }

        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }

    private static void bublsort(int[] array) {
        for (int bigLen = array.length - 1; bigLen >= 0; bigLen--) {
            for (int i = 0; i < bigLen; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
