package less8;

import java.util.ArrayDeque;

/**
 * Очереди представляют структуру данных, работающую по принципу FIFO (first in - first out).
 * То есть чем раньше был добавлен элемент в коллекцию, тем раньше он из нее удаляется.
 * Это стандартная модель однонаправленной очереди.
 *
 * Однако бывают и двунаправленные - то есть такие, в которых мы можем добавить элемент не только в начало,
 * но и в конец. И соответственно удалить элемент не только из конца, но и из начала.
 *
 * Обобщенный интерфейс Queue<E> расширяет базовый интерфейс Collection и определяет поведение класса в качестве однонаправленной очереди. Свою функциональность он раскрывает через следующие методы:
 * Интерфейс Deque расширяет вышеописанный интерфейс Queue и определяет поведение двунаправленной очереди, которая работает как обычная однонаправленная очередь, либо как стек, действующий по принципу LIFO (последний вошел - первый вышел).
 */
public class Ex2 {

    public static void main(String[] args) {

        ArrayDeque<String> states = new ArrayDeque<String>();
        // стандартное добавление элементов
        states.add("Germany");
        states.addFirst("France"); // добавляем элемент в самое начало
        states.push("Great Britain"); // добавляем элемент в самое начало
        states.addLast("Spain"); // добавляем элемент в конец коллекции
        states.add("Italy");

        /**
         * Push и pop -- общепринятые названия методов структуры данных "Стэк".
         * Поэтому если вы хотите использовать объект данного класса только в качестве Стэка,
         * то рекомендуется вызывать именно эти методы, так легче понять,
         * что за структура данных перед ним и какова цель её использования в программе.
         */

        // получаем первый элемент без удаления
        String sFirst = states.getFirst();
        System.out.println(sFirst);     // Great Britain
        // получаем последний элемент без удаления
        String sLast = states.getLast();
        System.out.println(sLast);      // Italy

        System.out.printf("Queue size: %d \n", states.size());  // 5

        // перебор коллекции
        while(states.peek()!=null){
            // извлечение c начала
            System.out.println(states.pop());
        }

        // очередь из объектов Person
        ArrayDeque<Person> people = new ArrayDeque<Person>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        // перебор без извлечения
        for(Person p : people){

            System.out.println(p.getName());
        }
    }
}
class Person{

    private String name;
    public Person(String value){

        name=value;
    }
    String getName(){return name;}
}
