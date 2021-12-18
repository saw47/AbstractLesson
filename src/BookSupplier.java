
public class BookSupplier extends User implements Supplier, Reader {

    private String work;

    public BookSupplier(String name, int age, String sex, String work) {
        super(name,age,sex);
        this.work = work;
    }

    public String getWorkSupplier(Supplier user) {
        return work;
    }

    public void supplyProduct(Librarian user, Book book) {
        System.out.println("Сотрудник компании - поставщика " + work + " " + name +
                " отдал библиотекарю " + ((User)user).getUserName((User)user) + " книгу " + book.getBookName(book));
    }

    public void takeAwayProduct(Supplier user, Book book) {
        System.out.println("Метод не реализуется в этом классе");
    }

    public void returnBook(Administrator user, Book book) {
        System.out.println("Читатель " + name + " вернул книгу " + book.getBookName(book) + " сотруднику библиотеки "
                + ((User)user).getUserName((User)user));
    }

    public void takeBook(Administrator user, Book book) {
        System.out.println("Читатель " + name + " взял книгу " + book.getBookName(book) + " у сотрудника библиотеки "
                + ((User)user).getUserName((User)user));
    }
}
