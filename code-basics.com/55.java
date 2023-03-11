public class App {
    public static String joinNumbersFromRange(int start, int finish) {
        var i = start;
        var result = "";
        while (i <= finish) {
            result = result + i;
            i = i + 1;
        }
        return result;
    }
}
