public class TryExample {
    public static void main(String[] args) {

        try {
            String name = null;

            // Trying to find the length of a null string
            System.out.println(name.length());

        } catch (NullPointerException e) {
            System.out.println("String is null.");
        }

        System.out.println("Program continues...");
    }
}