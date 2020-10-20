package less2.tools;

public class UnaryBinary {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        y = x++;

        y = ++x;

        y = x--;

        y = --x;

        System.out.println(y);

        System.out.println(5+5);
        System.out.println(5-5);
        System.out.println(5*5);
        System.out.println(5/5);
        System.out.println(5%4);
        System.out.println(5%10);
        System.out.println(5%2);
        System.out.println(5%3);
        System.out.println(5%6);
    }
}
