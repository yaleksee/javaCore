package less2.tools;

public class SolutionIF {
    public static void main(String[] args) {

        int x = 12;
        x = x++;
        int y = x;

        if (y > 12) {
            System.out.println("молодец, "); // 1
        }

        y = x++;

        if (y + 1 == x --) {
            System.out.println("и как ты сюда попал ?! "); // 2
        }

        if (x % y == 0) {
            System.out.println("повтори основы java!"); // 3
        }
    }
}
