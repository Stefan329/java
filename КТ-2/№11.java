import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner input = new Scanner (System.in);
        String coin = input.nextLine();
        System.out.println("Вы ввели: " + coin);
        lower(coin);
    }

    private static void lower(String coin) {
        coin = coin.toLowerCase();
        delete(coin);
    }

    private static void delete(String coin) {
        String [] cow = {"а","я","у","ю","о","е","ё","э","и","ы","a","e","i","o","y","u"};
        for (int i=0; i < cow.length; i++) {
            coin = coin.replace(cow[i], "");
        }
        upper(coin);
    }

    private static void upper(String coin) {
        coin = coin.substring(0,1).toUpperCase() + coin.substring(1).toLowerCase();
        print(coin);
    }

    private static void print(String coin) {
        System.out.println("Результат: " + coin);
    }
}
