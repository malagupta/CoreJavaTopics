package method_overriding;

public class Library {
    public static void main(String[] args) {
        final var book = new Book("Java", "Manning Publications");
        System.out.println(book);
    }
}
