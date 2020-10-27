package less4.oop;

public class TEPhone extends AbstractPhone {

    public TEPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("вращайте ручку,сэр");
        System.out.println("Сообщите номер абонента, сэр");
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Телефон звонит");
    }
}

class Phone extends AbstractPhone {
    public Phone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("вызываю номер " + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Телефон звонит");
    }
}

class VideoPhone extends AbstractPhone{

    public VideoPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("вызываю номер + видео" + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Телефон звонит, вклю камеру");
    }
}

class Test{
    public static void main(String[] args) {
        AbstractPhone firstPhone = new TEPhone(1890);
        AbstractPhone phone = new Phone(1970);
        AbstractPhone videoPhone = new VideoPhone(2010);

        User user = new User("С");
        user.callAnotherUser(123, firstPhone);
        user.callAnotherUser(123, phone);
        user.callAnotherUser(123, firstPhone);

    }
}
