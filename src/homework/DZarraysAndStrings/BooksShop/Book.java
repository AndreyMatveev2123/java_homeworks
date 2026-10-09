package src.homework.DZarraysAndStrings.BooksShop;

public class Book {
    private String bookName;
    private int bookPrice;
    private int bookPublish;

    public Book(String bookName, int bookPrice, int bookPublish){
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookPublish = bookPublish;
    }

    public String getBookName(){
        return bookName;
    }

       public int getBookPrice(){
        return bookPrice;
    }

       public int getBookPublish(){
        return bookPublish;
    }
}
