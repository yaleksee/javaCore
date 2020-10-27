package less4.interfaceex;

public class Smartphone {
    private Application application;

    public Smartphone() {
        this.application = new Telegram();
    }
}

interface Application {

}
