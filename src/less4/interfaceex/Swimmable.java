package less4.interfaceex;

public interface Swimmable {
    void swim();
}

class Duck implements Swimmable{

    @Override
    public void swim() {
        System.out.println("Уточка плыви!!");
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.swim();
    }
}
