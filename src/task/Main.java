package task;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        var author1 = new Author("Фридрих", "Ницше");
        var author2 = new Author("Артур", "Шопингауэр");
        var author3 = new Author("Евгений", "Петров");
        var author4 = new Author("Дж.", "Джером");
        var author5 = new Author("Дж.", "Джером");
        var book1 = new Book("Весёлая наука", author1, 1882);
        var book2 = new Book("О свободе воли", author2, 1839);
        var book3 = new Book("Путешествие на Дальний Восток", author2, 1938);
        var book4 = new Book("Трое в лодке не считая собаки", author2, 1889);
        var book5 = new Book("Трое в лодке не считая собаки", author2, 1889);



        System.out.println(author1);
        System.out.println(book1 +"\n");
        System.out.println("\n" + author2);
        System.out.println("\n" + book2 +"\n");
        System.out.println("\n" + author3);
        System.out.println("\n" + book3 +"\n");
        System.out.println("\n" + author4 );
        System.out.println("\n" + book4 +"\n");


        book1.setPublicationYear(LocalDate.now().getYear());
        System.out.println(book1 +"\n");

        //1.10 equals
        System.out.println(book4.equals(book5));

    }
}
