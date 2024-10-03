public class Book {
    private String name;
    private Author author;
    private double price;
    int qty = 0;
    public Book (String name) {
        this.name = name;
    }
    String getName(){
        return name;
    }
    Author getAuthor(){
        return author;
    }
    Double getPrice(){
        return price;
    }
    int getQty(){
        return qty;
    }
    public void setPrice(double p){
        this.price = p;
    }
    public void setAuthor(Author a){
        this.author = a;
    }
    public void setQty(int q){
        this.qty = q;
    }
}