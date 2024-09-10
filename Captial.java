package Character;

public class Captial {
    public static void isUppercase(String a) {
        for (int i = 0; i < a.length(); i++) {
            char aChar = a.charAt(i);
            if (97 <= aChar && aChar <= 122) {
                aChar = (char) (aChar - 32);
            }
            System.out.print(aChar);
        }
        System.out.println();
    }

    public static void isUppervowel(char[] str) {
        int N = str.length;
        for (int i = 0; i < N; i++) {
            if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u') {
                str[i] = Character.toUpperCase(str[i]);
            }
        }
        for (char c : str) {
            System.out.print(c);
        }
        System.out.println();
    }
}
