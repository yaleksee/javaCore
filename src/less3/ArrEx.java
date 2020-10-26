package less3;

import java.lang.reflect.Array;

public class ArrEx {
    public static void main(String[] args) {

        int[] nums;
        nums = new int[5];

        nums[4] = 100;

        int last = nums[nums.length - 1];


        System.out.println(nums.length);
        System.out.println(last);

        int[][] nums2 = {{0, 2, 3}, {1, 2, 3, 4, 5}};

        int[][] ints2_2 = new int[2][3];

        ints2_2[1][0] = 44;

        Integer[] integers = new Integer[10];

        System.out.println();

    }
}

class ArrEx2 {
    public static void main(String[] args) {

        int[] arr = new int[3]; // type[]
        Integer[] integers = new Integer[3]; // type[]

        String[] strings = (String[]) Array.newInstance(String.class, 3);
        String[] strings1 = new String[3];

        int[] arrC = new int[5];

    }
}

class LoopArr {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i : arr) {
            System.out.println(i);
        }


        int[][] nums = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < nums.length; i++) {
           for(int j = 0; j<nums[i].length; j++){
               System.out.print(nums[i][j]);
           }
            System.out.println();
        }

    }

}
