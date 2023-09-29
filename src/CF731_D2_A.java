import java.util.Scanner;

public class CF731_D2_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read inputs
        String word = sc.next();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int initialIndex = 0;

        int result = 0;

        // Solve
        for (char ch : word.toCharArray()) {
            // get char index
            int ix = getIndex(alphabet, ch);

            // calculate distance between them
            int dist = Math.abs(ix - initialIndex);

            // minimum distance
            int minDist = Math.min(dist, alphabet.length - dist);

            result += minDist;

            // update current index
            initialIndex = ix;

        }

        // Output results
        System.out.println(result);

        sc.close();
    }

    private static int getIndex(char[] word, char ch) {
        for (int i = 0; i < word.length; i++) {
            if (word[i] == ch) {
                return i;
            }
        }
        return -1;
    }

}
