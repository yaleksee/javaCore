package less4.oop;

public class User {
    private String name;
    private String fName;
    private String sName;

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, String fName, String sName) {
        this.name = name;
        this.fName = fName;
        this.sName = sName;
    }

    public void callAnotherUser(int number, AbstractPhone phone) {
        phone.call(number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getFname() {
        return fName;
    }

    public String getSname() {
        return sName;
    }


}

class Test2 {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.getName());
        user.setName("S");
        System.out.println(user.getName());

        User user2 = new User("N", "Fn", "Sn");
        System.out.println(user.getName() + " " + user.getFname() + " " + user.getSname());
    }
}
