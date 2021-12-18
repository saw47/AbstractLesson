public class LibraryGuest extends User implements Reader {

    private int libraryCardNumber;

    public LibraryGuest(String name, int age, String sex, int libraryCardNumber) {
        super(name,age,sex);
        this.libraryCardNumber = libraryCardNumber;
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
