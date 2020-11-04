package less6.dz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DZ {


    public static void main(String[] args) {
        dz1();
        dz2();

    }

    /**
     * Напишите регулярное выражение для обнаружения повторяющихся символов
     */

    private static void dz2() {

        System.out.println("Напишите регулярное выражение для обнаружения повторяющихся символов");

        String[] samples = {"dgbvawq", "m,kl;po", "cbcbcbc", "z_qwertyuiop_z"}; // false, false, true, true

        String reg = " ";

        Pattern p = Pattern.compile(reg);

        for (String s : samples) {
            Matcher m = p.matcher(s);
            System.out.println(m.matches());
        }


    }

    /**
     * 1. Санкт-Петербург
     */
    private static void dz1() {

        System.out.println("Санкт-Петербург был основан в 1703 году Петром Первым . За свою историю он носил имена: Санкт-Петербург, Петроград, Ленинград. Сейчас многие зовут его просто “Питер”.");

        Integer I = 1703;
        String a = "Петром Первым";
        String[] arrayNames = {"Санкт-Петербург", "Петроград", "Ленинград"};
        String b = "Питер";


        String result = String.format("Санкт-Петербург был основан в %d...", I); // продолжите

        System.out.println(result);
    }


    // решения
    // String reg = "(.).*\\1";
    // String result = String.format("Санкт-Петербург был основан в %d году %s . За свою историю он носил имена: %s, %s, %s. Сейчас многие зовут его просто “%s”."
    //                , I, a, arrayNames[0], arrayNames[1], arrayNames[2], b);

}
