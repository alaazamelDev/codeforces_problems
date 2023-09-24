import java.util.Scanner;

public class CF281_D2_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read inputs
        String word = sc.next();


        // Solve
        String cap = word.substring(0, 1).toUpperCase().concat(word.substring(1));

        // Output results
        System.out.println(cap);

        sc.close();
    }

}
