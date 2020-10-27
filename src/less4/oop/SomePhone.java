package less4.oop;

public class SomePhone {

    private int year;
    private String company;

    public SomePhone(int year, String company) {
        this.year = year;
        this.company = company;
    }

    private void openConnection(){
        // ....
    }

    public void call(){
        openConnection();
        System.out.println("делаем вызов");
    }

    public void ring(){
        System.out.println("дзынь");
    }
}

class HacPhone{
    public static void main(String[] args) {
        SomePhone somePhone = new SomePhone(2000, "qqq");


    }
}
