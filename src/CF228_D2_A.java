import java.util.Scanner;

public class CF228_D2_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read inputs
        int[] horseshoes = new int[4];

        // Solve
        int total = 0;
        for (int i = 0; i < 4; i++) {
            int shoe = sc.nextInt();
            if (contains(shoe, horseshoes)) {
                total++;
            }
            horseshoes[i] = shoe;
        }

        // Output results
        System.out.println(total);

        sc.close();
    }

    private static boolean contains(int num, int[] arr) {
        for (int j : arr) {
            if (j == num) {
                return true;
            }
        }
        return false;
    }
}
