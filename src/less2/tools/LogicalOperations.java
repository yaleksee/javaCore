package less2.tools;

public class LogicalOperations {
    public static void main(String[] args) {

        boolean result = false;

        result = getTrue() & getFalse();        // Логическое AND (И)
        result = getFalse() & getTrue();        // Логическое AND (И)

        result = getTrue() && getFalse();       // Сокращённое AND
        result = getFalse() && getTrue();       // Сокращённое AND
        result = getFalse() && getFalse();      // Сокращённое AND
        result = getTrue() && getTrue();        // Сокращённое AND

        result = getFalse() | getTrue();        // Логическое OR (ИЛИ)
        result = getTrue() | getFalse();        // Логическое OR (ИЛИ)

        result = getTrue() || getFalse();       // Сокращённое OR
        result = getFalse() || getTrue();       // Сокращённое OR
        result = getFalse() || getFalse();      // Сокращённое OR
        result = getTrue() || getTrue();        // Сокращённое OR

        result = getTrue() ^ getFalse();        // Логическое XOR (исключающее OR (ИЛИ))

        result = !getTrue();                    // Логическое унарное NOT (НЕ)
        result = !getFalse();

        result = getTrue() == getFalse();       // Равно
        result = getTrue() != getFalse();       // Не равно

        String s = getTrue() ? "истина" : "ложь"; // ? ..... : Тернарный (троичный) условный оператор
        String s2 = getFalse() ? "истина" : "ложь";

    }

    private static boolean getFalse() {
        return false;
    }

    private static boolean getTrue() {
        return true;
    }
}
