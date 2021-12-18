
public class LibraryEmployee extends User implements Administrator, Librarian {

    private String workPosition;

    public LibraryEmployee(String name, int age, String sex, String workPosition) {
        super(name,age,sex);
        this.workPosition = workPosition;
    }

    public void overdueNotification(Reader user, Book book) {
        System.out.println("Читатель " + ((User)user).getUserName((User)user) + " не вернул вовремя книгу "
                + book.getBookName(book) + " сотруднику " + workPosition + " " + name);
    }

    public void bookInventory(Librarian user) {
        System.out.println(workPosition + " " + name + " совместно с коллегой " + ((User)user).getUserName((User)user)
                + " проводят инвентаризацию");
    }
}

