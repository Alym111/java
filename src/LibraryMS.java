import java.util.Scanner;

class Book{
    String title;
    String author;
    Integer yearPublished;

    public Book(String title, String author, Integer yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getBookInfo(){
        return "Title: " + title + "\n Author: " + author + "\n Year: " + yearPublished.toString();
    }
    public void printBookDetails(){
        System.out.println(getBookInfo());
    }
}
class PrintedBook extends Book{
    Integer numberOfPages;
    String publisher;

    public PrintedBook(String title, String author, Integer yearPublished, Integer numberOfPages, String publisher) {
        super(title, author, yearPublished);
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }

    @Override
    public String getBookInfo() {
        return  super.getBookInfo() + "\n Pages: " + numberOfPages + "\nPublisher: " + publisher;
    }
    public void printBookDetails(){
        System.out.println(getBookInfo());
    }
}
class EBook extends Book{
    double filesizeMB;
    String fileFormat;

    public EBook(String title, String author, Integer yearPublished, double filesizeMB, String fileFormat) {
        super(title, author, yearPublished);
        this.filesizeMB = filesizeMB;
        this.fileFormat = fileFormat;
    }

    @Override
    public String getBookInfo() {
       return  super.getBookInfo() + "\n FileSize : " + filesizeMB + "\nFileFormat : " + fileFormat;
    }
    public void printBookDetails(){
        System.out.println(getBookInfo());
    }
}


public class LibraryMS {
    static Book[] books = new Book[100];
    static int bookCount = 0;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean opened = true;
        while (opened) {
            System.out.println("\nLibrary Menu");
            System.out.println("1.Add Printed Book");
            System.out.println("2.Add EBook");
            System.out.println("3.View All Books");
            System.out.println("4.Exit");
            System.out.print("Choose an option: ");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    addPrintedBook();
                    break;
                case 2:
                    addEBook();
                    break;
                case 3:
                    viewBooks();
                    break;
                case 4:
                    opened = false;
                    break;
                default:
                    System.out.println("нормально выберите ");
            }
        }
    }
    private static void addPrintedBook() {
        System.out.print("title: ");
        String title = scan.nextLine();
        System.out.print("author: ");
        String author = scan.nextLine();
        System.out.print("published: ");
        int year = scan.nextInt();
        System.out.print("number of pages: ");
        int pages = scan.nextInt();
        scan.nextLine();
        System.out.print("publisher: ");
        String publisher = scan.nextLine();
        books[bookCount] = new PrintedBook(title, author, year, pages, publisher);
        bookCount+=1;
        System.out.println("success");
    }

    private static void addEBook() {
        System.out.print("title: ");
        String title = scan.nextLine();
        System.out.print("author: ");
        String author = scan.nextLine();
        System.out.print("published year : ");
        int year = scan.nextInt();
        System.out.print("file size MB : ");
        double fileSize = scan.nextDouble();
        scan.nextLine();
        System.out.print("file format : ");
        String format = scan.nextLine();
        books[bookCount] = new EBook(title, author, year, fileSize, format);
        bookCount+=1;
        System.out.println("success");
    }

    private static void viewBooks() {
        if (bookCount == 0) {
            System.out.println("книг нету");
            return;
        }
        for (int i = 0; i < bookCount; i++) {
            books[i].printBookDetails();
        }
    }

}
