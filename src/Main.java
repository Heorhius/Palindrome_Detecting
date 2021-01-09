public class Main {

    public static void main(String[] args) {
        //numbers as String
        System.out.println("123 - " + isPalindrome("123"));
        System.out.println("123321 - " + isPalindrome("123321"));

        //numbers as integer
        System.out.println("456 - " + isPalindrome(456));
        System.out.println("45654 - " + isPalindrome(45654));

        //String values
        System.out.println("Hello - " + isPalindrome("Hello"));
        System.out.println("Ollo - " + isPalindrome("Ollo"));
    }

    public static boolean isPalindrome(int value) {
        return isPalindrome(String.valueOf(value));
    }

    public static boolean isPalindrome(String value) {
        char[] charArray = value.toLowerCase().toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
