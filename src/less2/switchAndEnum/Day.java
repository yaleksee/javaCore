package less2.switchAndEnum;

public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

class Program{
    public static void main(String[] args) {
        Day current = Day.TUESDAY;
        Day[] days = Day.values();
        System.out.println(current);
        System.out.println(current.ordinal());
    }
}
