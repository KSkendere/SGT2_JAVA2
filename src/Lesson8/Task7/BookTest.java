package Lesson8.Task7;

public class BookTest {
    public static void main(String[] args) {
        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com",'m');
        Book aBook = new Book("Java for dummy", anAuthor,19.95, 1000);
        Book anotherBook = new Book("more Java for dummy",new Author("Janis Berzins",
                "janis.berzins@inbox.lv",'m'),29.95,888);

        System.out.println(aBook.getAuthor().getName());
        System.out.println(aBook.getAuthor().getEmail());
        System.out.println(anotherBook.getAuthor().getName());
        System.out.println(anotherBook.getAuthor().getEmail());
        System.out.println(anotherBook.getAuthor().getGender());

        System.out.println(aBook);
        System.out.println(anotherBook);

        System.out.println(aBook.getAuthorName());
        System.out.println(aBook.getAuthorEmail());
        System.out.println(aBook.getAuthorGender());

        System.out.println(anotherBook.getAuthorName());
        System.out.println(anotherBook.getAuthorEmail());
        System.out.println(anotherBook.getAuthorGender());


    }
}
