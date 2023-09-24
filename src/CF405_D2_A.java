import java.util.Scanner;

public class CF405_D2_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read inputs
        int numOfColumns = sc.nextInt();
        int[] cols = new int[numOfColumns];

        for (int i = 0; i < numOfColumns; i++) {
            cols[i] = sc.nextInt();
        }

        // Solve
        // Bubble Sort
        for (int i = 0; i < numOfColumns; i++) {
            for (int j = 0; j < numOfColumns - i - 1; j++) {
                if (cols[j + 1] < cols[j]) {
                    // swap items
                    int item = cols[j];
                    cols[j] = cols[j + 1];
                    cols[j + 1] = item;
                }
            }
        }


        // Output results
        for (int num : cols) {
            System.out.print(num + " ");
        }

        sc.close();
    }

}
