package task;

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

    @Override
    public String toString() {
        return "Книга " +
                " " + name  +
                author +
                ", Год публикации " + publicationYear + " ";
    }
}
