package less5;

public class Person {
    int pid;
    String name;

    public Person(int pid, String name) {
        this.pid = pid;
        this.name = name;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

class Driver {
    public static void main(String[] args) {
        int id = 23;
        String name = "SSS";
        Person person = new Person(id, name);
        Person person2 = new Person(id, name);
        Person person3 = person;
        person = person3;
        person3 = person2;
        person = null;



    }
}
