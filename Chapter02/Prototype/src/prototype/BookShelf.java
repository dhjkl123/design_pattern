package prototype;

import java.util.ArrayList;

public class BookShelf implements Cloneable{
    private ArrayList<Book> shelf;

    public BookShelf() {
        shelf = new ArrayList<Book>();
    }

    public void addBook(Book book){
        shelf.add(book);
    }

    public ArrayList<Book> getShelf() {
        return shelf;
    }

    public void setShelf(ArrayList<Book> shelf) {
        this.shelf = shelf;
    }

    public String toString(){
        return shelf.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        BookShelf bookShelf = new BookShelf();

        for(Book book : shelf){
            bookShelf.addBook(new Book(book.getAuthor(), book.getTitle()));
        }

        return bookShelf;
    }
}
