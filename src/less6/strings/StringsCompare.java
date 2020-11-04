package less6.strings;

public class StringsCompare {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});


        //Поскольку мы имеем  дело с двумя разными объектами, оператор == вернёт false

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s4 == s5);
        System.out.println(s5 == s6);

        System.out.println("================");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equals(s6));
        System.out.println(s4.equals(s5));
        System.out.println(s5.equals(s6));

    }
}

class StringPool {
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");

        System.out.println("s1 == s2 :" + (s1 == s2));
        System.out.println("s1 == s3 :" + (s1 == s3));

    }
}

class StringPool2 {
    public static void main(String[] args) {
        String a = "string a";
        String b = new String("string a");
        String c = b.intern();

        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a == c);

        int i = 10;
        System.out.println("сейчас мы выведем строку " + a + ", и потом число " + i);

    }
}
