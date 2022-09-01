package task;

import java.util.Objects;

public class Author {
    private final String name;
    private final String surname;

    public Author (String name, String fullName) {
        this.name = name;
        this.surname = fullName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    //1.10 equals /hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && surname.equals(author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
    @Override
    public String toString() {
        return " Автор: " +
                " " + name +
                " " + surname ;
    }
}

