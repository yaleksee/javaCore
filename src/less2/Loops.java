package less2;

public class Loops {
    public static void main(String[] args) {

//        int i = 1;
//        while (i <= -100) {
//            System.out.println(i);
//            i++;
//        }

//        int x = 10;
//        do {
//            x--;
//            System.out.println(x);
//        } while (x > 0);


        /**
         * for(инициализация; логическое выражение (условие); шаг (итерация))
         *
         */

        int a = 0;

        for (int x = 1; x < 10; x++) {
            for (int y = 1; y < 10; y++) {
                a = x * y;
                System.out.print(a + " | ");
            }
            System.out.println();
        }

        int y = 10;

        int x = 0;

        for (int i = 1; i < 10; i++) {

            if (i == 3) {
                continue;
            }

//            if (y % i == 0) {
//                System.out.println("ok");
//                x = i;
//                break;
//            }
        }

    }
}
