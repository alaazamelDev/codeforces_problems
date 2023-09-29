import java.util.Scanner;

public class CF268_D2_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read inputs
        int n = sc.nextInt();
        int[][] teams = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                teams[i][j] = sc.nextInt();
            }
        }

        // Solve
        int total = 0;

        for (int i = 0; i < n; i++) {

            // get home color
            int currentHome = teams[i][0];

            // check away
            for (int j = 0; j < n; j++) {
                int currentAway = teams[j][1];
                if (currentHome == currentAway) {
                    total++;
                }
            }
        }


        // Output results
        System.out.println(total);

        sc.close();
    }

}
