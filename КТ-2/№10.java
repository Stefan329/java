import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = input.next();
        Coin(name);
    }
    private static void Coin(String voin) {
        voin = voin.substring(0,1).toUpperCase() + voin.substring(1).toLowerCase();
        Print(voin);
    }
    private static void Print(String voin) {
        System.out.println("Hello, " + voin);
    }
}
