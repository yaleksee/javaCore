package less2.switchAndEnum;

public class SwitchEx {
    public static void main(String[] args) {
        int month = 30;
        String monthName;
        switch (month) {
            case 1:
                monthName = "Январь";
                break;
            case 2:
                monthName = "Февраль";
                break;
            case 3:
                monthName = "Март";
                break;
            default:
                monthName = "не значем такого";
                break;
        }

        int result = getCountDayMonth(2020, 2);

        System.out.println(result);
    }

    private static int getCountDayMonth(int year, int month) {

        int result = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = 30;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                    result = 29;
                } else {
                    result = 28;
                }
                break;

            default:
                System.out.println("нет такого месяца");
        }

        return result;
    }
}
