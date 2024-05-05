class tasksheet10{
   public static void main(String[] args) {
    Book book1 = new Book("Harry Potter", "J.K. Rowling", 2003, 23.45);
    Book book2 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 2006, 36.64);
    Book book3 = new Book("The Twilight Saga", "Stephenie Meyer", 2007, 19.99);
    System.out.println("Book 1:\nTitle: "+book1.title+"\nAuthor: "+book1.author+"\nYear Published: "+book1.yearPublished+"\nPrice: $"+book1.price+"\n ");
    System.out.println("Book 2:\nTitle: "+book2.title+"\nAuthor: "+book2.author+"\nYear Published: "+book2.yearPublished+"\nPrice: $"+book2.price+"\n ");
    System.out.println("Book 3:\nTitle: "+book3.title+"\nAuthor: "+book3.author+"\nYear Published: "+book3.yearPublished+"\nPrice: $"+book3.price+"\n ");
   } 
}
class Book {
    String title;
    String author;
    int yearPublished;
    double price;

    Book(String title, String author, int yearPublished, double price){
        this. title = title;
        this. author = author;
        this. yearPublished = yearPublished;
        this. price = price;
    }
}