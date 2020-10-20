package less2;

public class Constants {

    public static final String PHONE_NUMBER = "+7 900 111 0 777 ";

    public static void main(String[] args) {
        int i = 0;
        // метод отправки смс
        sentSMS("привет");

        if (i < 5) {
            // ....
        }
    }

    private static void sentSMS(String text) {
        // логика отправки

        System.out.println("отправили " + text + " на номер " + PHONE_NUMBER);
    }
}
