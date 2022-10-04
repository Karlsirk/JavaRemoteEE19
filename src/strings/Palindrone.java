package strings;

import java.util.Scanner;

/**
 *
 * To check a given word is a palindrome
 *
 * @author Karl Sirkas
 */
public class Palindrone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scanner.nextLine();
        StringBuilder reversWord = new StringBuilder();

        //MADAM
        for(int i = word.length() - 1; i >= 0; i--){
            reversWord.append(word.charAt(i));

        }
        if(word.equalsIgnoreCase(reversWord.toString())) {
        System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }

    }
}
