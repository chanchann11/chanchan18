public class Main {
    public static void main(String[] args) {
        Book book = new Book("Bai tap OOP2.2");
        book.setPrice(123456789);
        book.setQty(1);
        Author author = new Author("Le Tran Doan Trang", "trangltd.24gite@vku.udn.vn", 'f');
        book.setAuthor(author);
        System.out.println("name " + book.getName());
        System.out.println("Author " + book.getAuthor());
        System.out.println("price " + book.getPrice());
        System.out.println("qty " + book.getQty());
    }
}