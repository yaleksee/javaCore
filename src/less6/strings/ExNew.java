package less6.strings;

public class ExNew { // aaaaaaaaSSSaaaaaaaa
    public static void main(String[] args) {
        boolean b = isPalindrome("aaaaaaaaSSSaaaaaaaa");
        boolean b2 =isPalindrome("aBa");

        String removeString = removeChar("aaaaaaaaSSSaaaaaaaa", 'S');
    }

    private static String removeChar(String remove, char s) {
        if(remove==null){
            return null;
        }
        return remove.replaceAll(Character.toString(s), "");
    }

    private static boolean isPalindrome(String palindrome) {
        if (palindrome == null) {
            return false;
        }
        int lenght = palindrome.length();
        for (int i = 0; i < lenght / 2; i++) {
            if (palindrome.charAt(i) != palindrome.charAt(lenght - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
