package less8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex1 {
    public static void main(java.lang.String[] args) {

        sort();
        reverse();
        shuffle();
        unmodifiableList();
    }

    private static void unmodifiableList() {
        List<String> solarSystem = List.of("mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune");
        solarSystem.add("Плутон");
    }

    private static void shuffle() {
        ArrayList<Integer> lottery = new ArrayList<>(100);
        for (int i = 1; i <= 100; i++) {
            lottery.add(i);
//добавляем в барабан числа от 1 до 100
        }

        Collections.shuffle(lottery);
//перемешиваем
        System.out.println("Внимание! Из барабана появляются первые 10 чисел!");
        for (int i = 0; i < 10; i++) {

            System.out.println(lottery.get(i));
        }
    }

    private static void reverse() {
        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList("mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"));
        Collections.sort(solarSystem);
        Collections.reverse(solarSystem);
        System.out.println(solarSystem);
    }

    private static void sort() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
    }
}
