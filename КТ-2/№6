package Simple1;
import java.util.Scanner;
public class Main {
    static int c = 2;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Coin(n);
    }

    private static void Coin(int n) {
        if (n>1) {
            if (n % c !=0) {
                c ++;
                Coin(n);
            }
            else if (n % c == 0) {
                Over(c, n);
            }
        }
    }

    private static void Over(int c, int n) {
        if (c == n) {
            System.out.println(n + " простое.");
        }
        else {
            System.out.println(n + " не простое.");
        }
    }
}
