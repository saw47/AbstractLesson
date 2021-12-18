public class Main {
    public static void main(String[] args) {

         Book book001 = new Book ("Как закалялась сталь", "Николай Островский");
         Book book002 = new Book ("Русское поле экспериментов", "Егор Летов");
         BookSupplier chamomileLLC = new BookSupplier("Иван Иванов", 34, "Мужской", "ООО Ромашка");
         LibraryEmployee hallAdmin = new LibraryEmployee("Иван Федоров", 35, "Мужской",
                 "Администратор зала");
         LibraryManager manager = new LibraryManager("Иван Николаев", 22, "Мужской",
                 "Директор");
         LibraryGuest ivanPetrov = new LibraryGuest("Иван Петров", 24, "Мужской",
                 000000001);

        chamomileLLC.supplyProduct(manager, book001);
        System.out.println("-------------------------");
        chamomileLLC.supplyProduct(hallAdmin, book002);
        System.out.println("-------------------------");
        manager.takeAwayProduct(chamomileLLC, book001);
        System.out.println("-------------------------");
        ivanPetrov.takeBook(hallAdmin, book001);
        System.out.println("-------------------------");
        chamomileLLC.returnBook(manager, book002);
        System.out.println("-------------------------");
        manager.overdueNotification(chamomileLLC, book001);
        System.out.println("-------------------------");
        hallAdmin.bookInventory(manager);
        System.out.println("-------------------------");

    }
}

/* Задание:
   В первой задаче у вас должно быть по интерфейсу на каждую роль, в каждом интерфейсе по набору
   соответствующих этой роли операций, каждая операция должна содержать в параметрах контрагента,
   причём тип параметра должен быть интерфейсом соответствующей роли.
 */

