public class App {
    public static void printNumbers(int firstNumber) {
        var i = firstNumber;
        while (i >= 1) {
            System.out.println(i);
            i = i - 1;
        }
        System.out.println("finished!");
    }
}
