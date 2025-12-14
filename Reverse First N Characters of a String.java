/*Constraints & Conditions
If Input 1 contains any character other than alphabets, print
Invalid Input.
If Input 2 is less than or equal to 0, print
Invalid Input.
If Input 2 is greater than the length of the string, print the string as it is.
Otherwise:
Reverse the first N characters of the string.
Append the remaining characters without change.
Print the final string.*/



import java.util.*;
class Reverse FirstNCharactersofaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();

        // only alphabets check
        if (!s.matches("[a-zA-Z]+") || n <= 0) {
            System.out.print("Invalid Input");
            return;
        }

        // if n greater than length
        if (n > s.length()) {
            System.out.print(s);
            return;
        }

        // reverse first n characters
        String rev = new StringBuilder(s.substring(0, n)).reverse().toString();
        System.out.print(rev + s.substring(n));
    }
}
