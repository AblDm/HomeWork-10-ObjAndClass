package task;

import java.util.Objects;

public class Book {

    private final String name;

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Book(String name, Author author, Integer publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    private final Author author;
    private Integer publicationYear;

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }
//1.10 equals /hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name) && author.equals(book.author) && publicationYear.equals(book.publicationYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publicationYear);
    }

    @Override
    public String toString() {
        return "Книга " +
                " " + name  +
                author +
                ", Год публикации " + publicationYear + " ";
    }
}
