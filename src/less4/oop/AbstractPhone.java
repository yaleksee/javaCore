package less4.oop;

public abstract class AbstractPhone {
    private int year;
    private int hour;
    public AbstractPhone(int year) {
        this.year = year;
    }

    public abstract void call(int outputNumber);

    public abstract void ring(int inputNumber);
}

abstract class WirelessPhone extends AbstractPhone {

    private int hour;

    public WirelessPhone(int year, int hour) {
        super(year);
        this.hour = hour;
    }
}

class CellPhone extends WirelessPhone {

    public CellPhone(int year, int hour) {
        super(year, hour);
    }

    @Override
    public void call(int outputNumber) {

    }

    @Override
    public void ring(int inputNumber) {

    }
}

class Smartphone extends CellPhone {
    private String operationSystem;

    public Smartphone(int year, int hour, String operationSystem) {
        super(year, hour);
        this.operationSystem = operationSystem;
    }

    public void install(String program) {
        System.out.println("установили новую программу = " + program);
    }
}


