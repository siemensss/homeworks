package homework12;

public class Main {
    public static void main(String args[]) {
        Author author1 = new Author("Михаил", "Булгаков");
        Author author2 = new Author("Фёдор", "Достоевский");
        Book book1 = new Book("Мастер и Маргарита", author1, 1973);
        Book book2 = new Book("Идиот", author2, 1868);
        System.out.println("book1.getYearOfPublication() = " + book1.getYearOfPublication());
        book1.setYearOfPublication(1978);
        System.out.println("book1.getYearOfPublication() = " + book1.getYearOfPublication());

    }
}
