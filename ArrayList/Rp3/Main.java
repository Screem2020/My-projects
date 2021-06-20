package ArrayList.Rp3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    /**
     * 1. Добавить книгу в список
     * 2. Добавить страницу книге (юзер вводит название книги, она ищется по equals и в найденной книге добавляется
     * новая страница, значения для которой юзер вводит с консоли)
     * 3. Удалить страницу из книги по ее номеру(юзер вводит название книги и номер страницы в ней для удаления, использовать equals)
     * 4. Удалить книгу по названию(юзер вводит название удаляемой книги, использовать equals)
     * 5. Вывести всю информацию о книгах (выводится названия всех книг и вся информация со страниц через toString)
     * 6. Вывести текст со страницы под номером из книги (пользователь вводит название книги и номер страницы, использовать equals)
     * 7. Выход
     */
    public static void main(String[] args) {
        List<Book> listBook = new ArrayList<>();
        int input = 0;
        int currentIndex = 0;
        Scanner scn = new Scanner(System.in);
        while (input != 7) {
            System.out.println("1. Добавить книгу в список\n" +
                    "2. Добавить страницу книге\n" +
                    "3. Удалить страницу из книги по ее номеру\n" +
                    "4. Удалить книгу по названию\n" +
                    "5. Вывести всю информацию о книгах\n" +
                    "6. Вывести текст со страницы под номером из книги\n" +
                    "7. Выход");
            input = scn.nextInt();
            switch (input) {
                case 1: {
                    System.out.println("Name book");
                    String name = scn.next().toLowerCase(Locale.ROOT);
                    Book newBook = new Book(name);
                    listBook.add(newBook);
                    currentIndex++;
                    break;
                }
                case 2: {
                    System.out.println("enter name book");
                    String name = scn.next();
                    Book book = new Book(name);
                    System.out.println("add num new page in the book");
                    int num = scn.nextInt();
                    System.out.println("add text for page");
                    String text = scn.next().toLowerCase(Locale.ROOT);
                    Page page = new Page(num, text);
                    boolean flag = false;
                    Book[] arrListBook = listBook.toArray(new Book[currentIndex]);
                    for (int i = 0; i < arrListBook.length; i++) {
                        boolean equals = arrListBook[i].equals(book);
                        if (equals) {
                            arrListBook[i].addPage(page);
                            flag = true;
                        }
                    }
                    if (flag) {
                        System.out.println("page add");
                    } else System.out.println("book is not found");
                    break;
                }
                case 3: {
                    System.out.println("enter name book");
                    String name = scn.next().toLowerCase(Locale.ROOT);
                    System.out.println("enter number page for delete");
                    int num = scn.nextInt();
                    Book book = new Book(name);
                    Book[] arrListBook = listBook.toArray(new Book[currentIndex]);
                    boolean flag = false;
                    for (int i = 0; i < arrListBook.length; i++) {
                        boolean equals = arrListBook[i].equals(book);
                        if (equals) {
                            arrListBook[i].removeIndex(num);
                            flag = true;
                        }
                    }
                    if (flag) System.out.println("delete page");
                    else System.out.println("unable to delete book");
                    break;
                }
                case 4: {
                    System.out.println("enter name book");
                    String name = scn.next().toLowerCase(Locale.ROOT);
                    Book book = new Book(name);
                    boolean flag = false;
                    Book[] arrListBook = listBook.toArray(new Book[book.size()]);
                    for (int i = 0; i < arrListBook.length; i++) {
                        boolean equals = arrListBook[i].equals(book);
                        if (equals) {
                            arrListBook[i] = arrListBook[i + 1];
                            arrListBook = null;
                            flag = true;
                        }
                    }
                    if (flag) System.out.println("book delete");
                    else System.out.println("unable to delete book");
                    break;
                }
                case 5: {
                    System.out.println(listBook);
                    break;
                }
                case 6: {

                }
            }
        }
    }
}