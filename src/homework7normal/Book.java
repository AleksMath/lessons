package homework7normal;

public class Book {
    private String bookName2;
    private String autor;

    public Book(String bookName2, String autor) {
        this.bookName2 = bookName2;
        this.autor = autor;
    }

    public void setBookName(String bookName2) {
        this.bookName2 = bookName2;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getBookName2() {
        return bookName2;
    }

    public String getAutor() {
        return autor;
    }
}
