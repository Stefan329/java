public class App {
    public static String getSentenceTone(String sentence) {
        if (sentence.toUpperCase().equals(sentence)) {
            return "scream";
        }
        return "normal";
    }
}
