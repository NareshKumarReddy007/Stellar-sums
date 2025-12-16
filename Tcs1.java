/*An international round table conference will be held in india.presidents feom all over the world representing their respective countries will be attending the conference.
the task is to find the possible number of was p to make the n members sit around the circular table .the president and prime minister of india will always sit next to each other.*/
     //input:5;
     //output:48

import java.util.Scanner;
class Tcs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        // calculate (n-1)!
        for (int i = 1; i < n; i++) {
            fact = fact * i;
        }
        // President & Prime Minister together → 2 ways
        int result = fact * 2;

        System.out.println(result);
    }
}
