import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fact = 1;

        for (int i = n; i > 0; i--) {
            fact = fact * i;
        }

        boolean found = false;

        while (fact > 0) {
            int dig = fact % 10;
            fact = fact / 10;

            if (dig == 1) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
