import java.util.Scanner;

public class LongestWordFinder {
    public static String findLongestWord(String[] words) {
        String longestWord = words[0];

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number of words input
        System.out.print("Enter the number of words: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline

        String[] words = new String[n];

        // Taking words input
        System.out.println("Enter " + n + " words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        // Finding and displaying the longest word
        String longest = findLongestWord(words);
        System.out.println("Longest word: " + longest);

        sc.close();
    }
}
