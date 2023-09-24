import java.util.Scanner;

public class CF431_D2_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read inputs
        int[] calories = new int[4];
        for (int i = 0; i < 4; i++) {
            calories[i] = sc.nextInt();
        }

        // read the game process
        String process = sc.next();

        // Solve
        int total = 0;

        for (int i = 0; i < process.length(); i++) {
            char action = process.charAt(i);
            total += calories[Integer.parseInt(String.valueOf(action)) - 1];
        }

        // Output results
        System.out.println(total);

        sc.close();
    }

}
