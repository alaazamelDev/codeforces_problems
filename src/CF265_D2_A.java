import java.util.Scanner;

public class CF265_D2_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read inputs
        String str = sc.next();
        String inst = sc.next();


        int total = 0;
        int curIndex = 0;

        // Solve
        for (int i = 0; i < inst.length(); i++) {

            // current instruction
            char in = inst.charAt(i);

            // check for matching
            if (in == str.charAt(curIndex)) {
                total++;
                curIndex++;
            }
        }


        // Output results
        System.out.println(total + 1);

        sc.close();
    }

}
