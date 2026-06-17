import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();

        // Add all non-zero elements first
        for(int num : arr) {
            if(num != 0) {
                list.add(num);
            }
        }

        // Add zeros at the end
        for(int num : arr) {
            if(num == 0) {
                list.add(num);
            }
        }

        System.out.println(list);
    }
}
