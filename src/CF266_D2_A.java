import java.util.Scanner;

public class CF266_D2_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read inputs
        int n = sc.nextInt();
        String text = sc.next();


        // helpers
        char prev = ' ';

        // out
        int result = 0;

        // Solve
        for (int i = 0; i < n; i++) {
            char item = text.charAt(i);
            if (i == 0) {
                prev = item;
                continue;
            }

            if (prev == item) {
                result++;
            } else {
                prev = item;
            }
        }


        // Output results
        System.out.print(result);

        sc.close();
    }

}
