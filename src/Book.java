public class Book {
    private String bookName;
    private String bookAuthor;
    public Book(String bookName, String bookAuthor) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    public String getBookName(Book book) {
        return book.bookName;
    }

    public String getBookAuthor(Book book) {
        return book.bookAuthor;
    }
}
