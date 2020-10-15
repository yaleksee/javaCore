package less1;

public class Ex1 {

    /**
     * byte (целые числа, 1 байт, [-128, 127])
     * short (целые числа, 2 байта, [-32768, 32767])
     * int (целые числа, 4 байта, [-2147483648, 2147483647])
     * long (целые числа, 8 байт, [-9223372036854775808,9223372036854775807])
     * float (вещественные числа, 4 байта)
     * double (вещественные числа, 8 байт)
     * char (символ Unicode, 2 байта, [0, 65536])
     * boolean (значение истина/ложь, используется int, зависит от JVM)
     */

    public static void main(String[] args) {


        TestClass testClass;
        testClass = new TestClass();
        System.out.println(testClass);

        typeConverterExample();
        typeNarrowing();

    }


    /**
     * Преобразование может быть неявным и явным (приведение типов). Неявное преобразование может выполняться если:
     * <p>
     * типы совместимы (например – оба целочисленные)
     * размер “принимающего” типа больше чем у того, который преобразуется (так называемое “преобразование с расширением”)
     * int a = 123454;
     * double b =  a; //неявное преобразование - преобразование с расширением
     * <p>
     * Явное преобразование имеет вид переменная_нового_типа = (новый_тип) имя переменной;
     * <p>
     * int a;
     * byte b = (byte) a; //b будет остатком от деления a на диапазон byte, может быть потеря данных
     */

    public static void typeConverterExample() {
        long a = 100L;
        double b = 300.6565565546;
        Object ab = a + b;
        System.out.println(ab.getClass().getName() + " value: " + ab); //java.lang.Double value: 400.0

        double c = 1000.05;
        long d = 1000;
        Object cd = c + d;
        System.out.println(cd.getClass().getName() + " value: " + cd);//java.lang.Double value: 2000.05
    }

    public static void typeNarrowing() {
        int a0 = 64;
        int a = 257;
        int a2 = 126;
        int a3 = 129;
        byte b0 = (byte) a0;
        byte b = (byte) a;
        byte b2 = (byte) a2;
        byte b3 = (byte) a3;
        System.out.println(b0 + " " + b + " " + b2 + " " + b3); //64 1 126 -127

        double c = 56.9876;
        int d = (int) c;
        System.out.println(d); //56

        long e = 1000L;
        float f = (float) e;
        System.out.println(f); //1000.0


        Integer i = a0;
        System.out.println(a0);
        System.out.println(i);
    }

    // инициализция переменных по умолчанию
    static class TestClass {
        int a;
        double b;
        float c;
        char d;
        String s;
        Object o;
        boolean e;
        long aLong;

        @Override
        public String toString() {
            return "TestClass{" +
                    "a=" + a +
                    ", b=" + b +
                    ", c=" + c +
                    ", d=" + d +
                    ", s='" + s + '\'' +
                    ", o=" + o +
                    ", e=" + e +
                    ", along=" + aLong;
        };
    }
}






