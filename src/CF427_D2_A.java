import java.util.Scanner;

public class CF427_D2_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read inputs
        int n = sc.nextInt();


        // Solve
        int duels = 0;
        int untreated = 0;

        for (int i = 0; i < n; i++) {

            // read event
            int event = sc.nextInt();

            int temp = event + duels;
            if (temp < 0) {
                untreated++;
                duels = 0;
            } else {
                duels += event;
            }
        }

        // Output results
        System.out.println(untreated);

        sc.close();
    }

}
