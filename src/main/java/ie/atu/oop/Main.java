package ie.atu.oop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book firstbook = new Book();
        firstbook.title = "Dune";
        firstbook.author = "Frank Herbert";
        firstbook.pageCount = 412;

        firstbook.displayDetails();
        firstbook.borrowBook();
        firstbook.displayDetails();

        Book secondBook = createBook("Clean Code", "Dan Williams", 223);
        Book thirdBook = createBook("Another Book Code", "John Murphy", 333);
        Book fourthBook = createBook("Student Life", "Mary shelly", 442);
        System.out.println("\n");
        secondBook.displayDetails();
        System.out.println("\n");
        thirdBook.displayDetails();
        System.out.println("\n");
        fourthBook.displayDetails();
    }


    private static Book createBook(String title, String author, int pageCount)
    {
        Book book = new Book();
        book.title = title;
        book.author = author;
        book.pageCount = pageCount;
        return book;
    }
}