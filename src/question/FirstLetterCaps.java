package question;

public class FirstLetterCaps {
    public static void main(String[] args) {
        String str = "seven";
        char[] chars  = str.toCharArray();
        char character =  Character.toUpperCase(str.charAt(0));
        chars[0] = character;
        System.out.println(chars);

    }
}
