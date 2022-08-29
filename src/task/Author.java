package task;

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

    @Override
    public String toString() {
        return ", Автор: " +
                " " + name +
                " " + surname ;
    }
}

