package homework12;

public class Main {
    public static void main(String args[]) {
        Author author1 = new Author("Михаил", "Булгаков");
        Author author2 = new Author("Фёдор", "Достоевский");
        Author author3 = new Author("Сергей", "Довлатов");
        Book book1 = new Book("Мастер и Маргарита", author1, 1973);
        Book book2 = new Book("Идиот", author2, 1868);
        Book book3 = new Book("Компромисс", author3, 1981);
        System.out.println("Год публикации книги: <<" + book1.getTitle() + ">> - " + book1.getYearOfPublication());
        book1.setYearOfPublication(1978);
        System.out.println("Изменённый год публикации книги: <<" + book1.getTitle() + ">> - " + book1.getYearOfPublication());
        printSeparator();
        System.out.println(book1);
        printSeparator();
        System.out.println(book2);
        printSeparator();
        System.out.println(book3);
        printSeparator();
        Book book4 = new Book("Мастер и Маргарита", author1, 1973);
        if (book3.equals(book4)) {
            System.out.println("Книги одинаковые");
        } else {
            System.out.println("Книги разные");
        }

    }
    public static void printSeparator () {
        System.out.println("------------------------");
    }
}
