package homework7normal;

public class Reader {
    private String fullname;
    private int readerTicketNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    Book book = new Book("Идиот","Достаевский");
    void takeBook(int quantityBook) {
        System.out.println(fullname + " взял " + quantityBook + " книги");
    }
    void takeBook(String bookName) {
        System.out.println(fullname + " взял книгу " +bookName);
    }
    void takeBook(Book book) {
        System.out.println(fullname + " взял книгу " +book.getBookName2() +"Автор "+ book.getAutor());
    }

    public Reader(String fullname, int readerTicketNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullname = fullname;
        this.readerTicketNumber = readerTicketNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

}
