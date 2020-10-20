package less2.dz;

public class Solution {
    static int i = 0;



    static boolean foo(char c) {
        System.out.println(c);
        i++;
        return true;
    }

    public static void main(String[] args) {
        for (foo('A'); foo('B') && (i < 3); foo('C')) {

            foo('D');
        }
    }
}
