package homework12;

import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Автор: " + name + " " + surname;
    }

    @Override
    public boolean equals(Object Other) {
        if (this.getClass() != Other.getClass()){
            return false;
        }
        Author c = (Author) Other;

        return (name.equals(c.name)) && (surname.equals(c.surname));
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }
}
