public interface Supplier {

    void supplyProduct(Librarian user, Book book);
    void takeAwayProduct(Supplier user, Book book);

}
