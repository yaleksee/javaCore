package less5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exсeptions {
    /**
     * ArithmeticException
     * Бросается, когда в арифметической операции возникло исключительное условие.
     * <p>
     * ArrayIndexOutOfBoundsException
     * Брошено, чтобы указать, что к массиву обращались с недопустимым индексом. Индекс либо отрицательный, либо больше или равен размеру массива.
     * <p>
     * ClassNotFoundException
     * Это исключение возникает, когда мы пытаемся получить доступ к классу, определение которого не найдено
     * <p>
     * FileNotFoundException
     * Это исключение возникает, когда файл недоступен или не открывается.
     * <p>
     * IOException
     * Он выбрасывается, когда операция ввода-вывода завершилась неудачно или прервана
     * <p>
     * InterruptedException
     * Он генерируется, когда поток ожидает, спит или выполняет некоторую обработку, и прерывается.
     * <p>
     * NoSuchFieldException
     * Выдается, когда класс не содержит указанное поле (или переменную)
     * <p>
     * NoSuchMethodException
     * Брошено при доступе к методу, который не найден.
     * <p>
     * Исключение нулевого указателя
     * Это исключение возникает при обращении к элементам нулевого объекта. Null ничего не представляет
     * <p>
     * NumberFormatException
     * Это исключение возникает, когда метод не может преобразовать строку в числовой формат.
     * <p>
     * RuntimeException
     * Это представляет любое исключение, которое происходит во время выполнения.
     * <p>
     * StringIndexOutOfBoundsException
     * Он вызывается методами класса String, чтобы указать, что индекс либо отрицателен, чем размер строки
     */

    public static void main(String args[]) {

        try {
            int a = 30, b = 0;
            int c = a / b;  // нельзя делить на ноль
            System.out.println("Result = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide a number by 0");
        }

        try {
            String a = null; // нулевое значение
            System.out.println(a.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException..");
        }

        try {
            String a = "This is like chipping "; // длина 22
            char c = a.charAt(24); // доступ к 25-му элементу
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }

        try {
            // Следующий файл не существует

            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");

        }

        try {
            // "акки" не число
            int num = Integer.parseInt("akki");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }


        {
            try {
                int a[] = new int[5];
                a[6] = 9; // доступ к 7-му элементу в массиве
                // размер 5
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index is Out Of Bounds");
            }

        }

    }
}
