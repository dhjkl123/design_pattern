import prototype.Book;
import prototype.BookShelf;

public class App {
    public static void main(String[] args) throws Exception {
        BookShelf bookShelf = new BookShelf();

        bookShelf.addBook(new Book("김병산", "한우물"));
        bookShelf.addBook(new Book("강감찬", "해골물"));
        bookShelf.addBook(new Book("이순신", "수돗물"));

        System.out.println(bookShelf);

        BookShelf another = (BookShelf)bookShelf.clone();
        System.out.println(another);

        bookShelf.getShelf().get(0).setAuthor("권석원");
        bookShelf.getShelf().get(0).setTitle("오르카");

        System.out.println(bookShelf);
        System.out.println(another);
    }
}
