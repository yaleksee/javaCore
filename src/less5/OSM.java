package less5;

public class OSM {
    public static void main(String[] args) throws InterruptedException {



        generateOM();
    }

    private static void generateOM() throws InterruptedException {
        int iter = 20;
        System.out.println("start");

        for (int outerIter = 1; outerIter < 20; outerIter++) {

            System.out.println("outerIter : " + outerIter + " Free mem: " + Runtime.getRuntime().freeMemory());

            int loop1 = 2;
            int[] memoryFillIntVar = new int[iter];

            do {
                memoryFillIntVar[loop1] = 0;
                loop1--;
            } while (loop1 > 0);
            iter = iter * 10;
            System.out.println("Required mem for next loop: " + iter);
            Thread.sleep(1000);
        }
    }
}
