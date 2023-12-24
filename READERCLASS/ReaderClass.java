public class ReaderClass {
    public brc() {
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("ENTER YOUR NAME");
            String name = reader.readLine();
            System.out.println("Name=" + name);
        } catch (Exception var4) {
        }
}
