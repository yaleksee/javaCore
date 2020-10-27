package less4.orderInit;

public class Pet {
    private String name;

    static {
        System.out.println(" Pet -1- ");
    }

    {
        System.out.println(" Pet -2- ");
    }

    {
        System.out.println(" Pet -3- ");
    }

    public Pet() {
        System.out.println(" Pet -4- ");
    }

    public Pet(String name) {
        this.name = name;
        System.out.println(" Pet -5- ");
    }
}


class Cat extends Pet{
    private String name;

    static {
        System.out.println(" Cat -1- ");
    }

    {
        System.out.println(" Cat -2- ");
    }

    {
        System.out.println(" Cat -3- ");
    }

    public Cat() {
        System.out.println(" Cat -4- ");
    }

    public Cat(String name) {
        super(name);
        this.name = name;
        System.out.println(" Cat -5- ");
    }
}

class TestPet{
    public static void main(String[] args) {
        Cat cat = new Cat("S");
    }
}
