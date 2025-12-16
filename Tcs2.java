/*Question: Monkey Feeding Problem
A group of monkeys is sitting on a tree. You are given:
n → Total number of monkeys on the tree
k → Number of bananas needed to satisfy one monkey
j → Number of peanuts needed to satisfy one monkey
m → Total number of bananas available
p → Total number of peanuts available
A monkey comes down from the tree if it gets enough bananas or enough peanuts.
Write a program to calculate how many monkeys are left on the tree after distributing bananas and peanuts.
Input Format:
Five integers separated by spaces: n k j m p
Output Format:
Print the number of monkeys left on the tree.
Example:
Input: 10 2 3 12 9
Output: 4
Explanation:
Bananas: 12 / 2 = 6 monkeys can eat
Peanuts: 9 / 3 = 3 monkeys can eat
Total monkeys that come down = 6 + 3 = 9 (be careful of double counting!)
Monkeys left = 10 - 9 = 1 */
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // total monkeys
        int k = sc.nextInt(); // bananas per monkey
        int j = sc.nextInt(); // peanuts per monkey
        int m = sc.nextInt(); // total bananas
        int p = sc.nextInt(); // total peanuts

        int monkeysBanana = m / k;
        int monkeysPeanut = p / j;

        int totalDown = monkeysBanana + monkeysPeanut;

        int monkeysLeft = n - totalDown;

        System.out.println("number of monkey left on tree = " + monkeysLeft);
    }
}
