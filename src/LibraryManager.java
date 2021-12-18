public class LibraryManager extends User implements Librarian, Administrator, Supplier {

    private String workPosition;

    public LibraryManager(String name, int age, String sex, String workPosition) {
        super(name,age,sex);
        this.workPosition = workPosition;
    }

    public void bookInventory(Librarian user) {
        System.out.println(workPosition + " " + name + " совместно с коллегой " + ((User)user).getUserName((User)user)
                + " проводят инвентаризацию");
    }

    public void overdueNotification(Reader user, Book book) {
        System.out.println("Читатель " + ((User)user).getUserName((User)user) + " не вернул вовремя книгу "
                + book.getBookName(book) + " сотруднику " + workPosition + " " + name);
    }

    public void supplyProduct(Librarian user, Book book) {
        System.out.println("Метод не реализуется в этом классе");
    }

    public void takeAwayProduct(Supplier user, Book book) {
        System.out.println(workPosition + " " + name + " вернул поставщику "
                + ((BookSupplier)user).getWorkSupplier((BookSupplier)user) + " книгу " + book.getBookName(book));
    }

}
