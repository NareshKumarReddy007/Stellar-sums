public class Main {
    public static void main(String[] args) {

        int n = 103432;
        int temp = n;
        int sum = 0;

        while (temp != 0) {

            int digit = temp % 10;
            int count = 0;
            int copy = n;

            // Count how many times digit appears
            while (copy != 0) {
                if (copy % 10 == digit) {
                    count++;
                }
                copy /= 10;
            }

            // Add only if it appears once
            if (count == 1) {
                sum += digit;
            }

            temp /= 10;
        }
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int n = 103432;
        int temp = n;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each digit
        while (temp != 0) {
            int digit = temp % 10;
            map.put(digit, map.getOrDefault(digit, 0) + 1);
            temp /= 10;
        }

        int sum = 0;

        // Add only digits that appear once
        for (int digit : map.keySet()) {
            if (map.get(digit) == 1) {
                sum += digit;
            }
        }

        System.out.println(sum);
    }
}
        System.out.println(sum);
    }
}
