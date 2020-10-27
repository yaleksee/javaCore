package less4.interfaceex;

public interface Messenger {
    void sendMessage();

    void getMessage();
}

class Telegram implements Messenger, Application{

    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в Телеграмме");
    }

    @Override
    public void getMessage() {
        System.out.println("Читаем сообщение в Телеграмме");
    }
}

class WhatsApp implements Messenger{

    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в WhatsApp");
    }

    @Override
    public void getMessage() {
        System.out.println("Читаем сообщение в WhatsApp");
    }
}

class Viber implements Messenger{

    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в Viber");
    }

    @Override
    public void getMessage() {
        System.out.println("Читаем сообщение в Viber");
    }
}

class Client{
//    private WhatsApp whatsApp;
//    private Telegram telegram;
//    private Viber viber;

    private Messenger messenger;

    public Client() {
        this.messenger = new Telegram();
    }
}
