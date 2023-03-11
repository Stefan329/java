public class App {
    public static String normalizeUrl(String site) {
        if (site.startsWith("https://")) {
            return site;
        }
        return "https://" + site;
    }
}
