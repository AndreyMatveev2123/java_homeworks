package src.homework.DZarraysAndStrings.BooksShop;

public class BooksShop {
    static Book[] catalog = new Book[5];
    static int count = 0;

    static void checkOrAdd(String bookName, int bookPrice, int bookPublish) {
        for (int i = 0; i < count; i++) {
            if (catalog[i].getBookName().equals(bookName)
                    && catalog[i].getBookPublish() == bookPublish) {
                System.out.printf("Книга «%s» (%d) уже есть в картотеке.%n", bookName, bookPublish);
                return;
            }
        }
        if (count == catalog.length) {
            System.out.println("Картотека заполнена, добавить книгу нельзя.");
            return;
        }
        catalog[count] = new Book(bookName, bookPrice, bookPublish);
        count++;
        System.out.printf("Книга «%s» (%d) добавлена в картотеку.%n", bookName, bookPublish);
    }  

    static void printAllBooks() {
        for (int i = 0; i < count; i++) {
            Book b = catalog[i];
            System.out.printf("%-25s %4d г. %6d руб.%n",
                    b.getBookName(), b.getBookPublish(), b.getBookPrice());
        }
    }

    public static void main(String[] args) {
        checkOrAdd("Мастер и Маргарита", 650, 1967);
        checkOrAdd("Война и мир", 900, 1869);
        checkOrAdd("Мастер и Маргарита", 650, 1967);
        printAllBooks();
    }
}