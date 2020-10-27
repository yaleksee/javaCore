package less4.params;

public class Ex {
    public static void main(String[] args) {
        int x = 3;
        int y = x;
        y = 55;
        x = 5;
        System.out.println(y + " " + x);

        Cat cat = new Cat("Бусинка");
        Cat cat2 = cat;
    }
}

class Cat{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    private int weight;

    public void setWeight(int voidWeight) {
        this.weight = voidWeight;
    }
}
