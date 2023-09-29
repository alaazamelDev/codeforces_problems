import java.util.Scanner;

public class CF732_D2_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read inputs
        int price = sc.nextInt();
        int coin = sc.nextInt();

        // Solve
        int res = 1;
        int i = 1;
        while (true) {
            int p = (i * price);
            if (p % 10 == 0 || (p - coin) % 10 == 0) {
                break;
            }

            i++;
            res++;
        }

        // Output results
        System.out.println(res);

        sc.close();
    }

}
