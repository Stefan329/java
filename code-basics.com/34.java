class App {
    public static void main(String[] args) {
        var name = "hexlet";
        name = name.toLowerCase();
        name = name.replace(name.substring(0, 1), "H");
        System.out.println(name);
    }
}
