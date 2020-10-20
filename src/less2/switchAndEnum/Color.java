package less2.switchAndEnum;

public enum Color {
    RED("#0000000"),
    BLUE("#11111"),
    GREEN("#22222");

    private String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}

class Program2{
    public static void main(String[] args) {
        System.out.println(Color.RED.getCode());
        System.out.println(Color.RED);
    }
}
