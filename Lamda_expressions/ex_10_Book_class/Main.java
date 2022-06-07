package Lamda_expressions.ex_10_Book_class;

import java.util.Scanner;

public class Main {
    //Создайте класс Book с полями
    //название книги
    //автор книги
    //цена книги
    //
    //Вы можете добавить на свое усмотрение конструкторы и прочие методы.
    //
    //Создайте класс Library с полями
    //List<Book> bookList = new ArrayList<>(); //список книг в библиотеке
    //
    //public void addBook(Book book) - Метод добавления книги в библиотеку
    //public List<Book> searchBook(IBook book, String key) - поиск нужной книги по ключу.
    // К примеру, это может быть поиск книги по автору, по названию или по цене.
    //Критерии поиска задаются через фукциональный интерфейс IBook,
    // а key - ключ поиска (имя автора, название книги или цена
    // (которую нужно будет перед началом работы сконвертировать в int))
    //
    //Создайте функциональный интерфейс IBook с методом
    //boolean search(Book book, String key);
    //
    //В мейне создайте библиотеку Library, заполните ее несколькими книгами и выполните:
    //1. Найдите все книги определенного автора (чье имя вводится с консоли, к примеру)
    //2. Найдите книгу по ее названию (название вводится, к примеру, с консоли)
    //3. Найдите все книги дешевле определенной цены (может вводиться с консоли)
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Library library = new Library();
        library.addBook(new Book("name1", "Misha", 100));
        library.addBook(new Book("name3", "Dima", 500));
        library.addBook(new Book("name2", "Ivan", 600));
        library.addBook(new Book("name2", "Misha", 400));
        int input = 0;
        while (input != 4) {
            System.out.println("""
                    1. Найдите все книги определенного автора (чье имя вводится с консоли, к примеру)
                    2. Найдите книгу по ее названию (название вводится, к примеру, с консоли)
                    3. Найдите все книги дешевле определенной цены (может вводиться с консоли)
                    """);
            input = scn.nextInt();
            if (input == 1) {
                System.out.println("Enter name Author"); {
                    String name = scn.next();
                    IBook iBook = (book, key) -> book.getAuthor().equalsIgnoreCase(key);
                    System.out.println(library.searchBook(iBook, name));

                }
            }
            if (input == 2) {
                System.out.println("Enter name book");
                String name = scn.next();
                IBook iBook = ((book, key) -> book.getName().equalsIgnoreCase(key));
                System.out.println(library.searchBook(iBook, name));

            }
            if (input == 3) {
                System.out.println("Enter price book");
                String price = scn.next();
                IBook iBook = (book, key) -> book.getPrice() < Integer.parseInt(key);
                System.out.println(library.searchBook(iBook, price));
            }
        }
    }
}
