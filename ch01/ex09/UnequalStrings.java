public class UnequalStrings {
    public static void main(String[] args) {
        char[] letters = {'H', 'e', 'l', 'l', 'o'};
        String word = "";

        for (int i = 0; i < letters.length; i++) {
            word += letters[i];
        }
        System.out.println(word);
        System.out.println("Hello");

        System.out.println(word.equals("Hello"));
        System.out.println(word == "Hello");
    }
}
