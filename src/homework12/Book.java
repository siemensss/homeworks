package homework12;

public class Book {
    private Author author;
    private String title;
    private int yearOfPublication;

    public Book(String title, Author author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return  "Название книги: " + "<<" + title + ">>\n" + author.toString() + "\nГод выпуска: " + yearOfPublication;
    }
    @Override
    public boolean equals(Object Other) {
        if (this.getClass() != Other.getClass()){
            return false;
        }
        Book c = (Book) Other;
        return (author.equals(c.author)) && (title.equals(c.title) && (yearOfPublication == c.yearOfPublication));
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(author, title, yearOfPublication);
    }
}
