package basic.section9;

public class Book extends Item {
    private String writer;
    private String isbn;

    public Book(String name, int price, String writer, String isbn) {
        super(name, price);
        this.writer = writer;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 저자: " + writer + " isbn: " + isbn);
    }

}
