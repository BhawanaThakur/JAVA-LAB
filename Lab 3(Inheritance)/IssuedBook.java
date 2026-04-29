class Book {
    String title;
    String author;
Book(String title, String author) {
    this.title = title;
    this.author = author;

}
void displayBook() {
    System.out.println("Title: " + title);    
    System.out.println("Author: " + author);
}
}
public class IssuedBook extends Book{
    String IssueDate;
    String returnDate;
    IssuedBook(String title, String author, String IssueDate, String returnDate) {
        super(title, author);
        this.IssueDate = IssueDate;
        this.returnDate = returnDate;
    }
    void displayIssuedBook() {
        displayBook();
        System.out.println("Issue Date: " + IssueDate);
        System.out.println("Return Date: " + returnDate);
    }

    public static void main(String[] args) {
        IssuedBook issuedBook = new IssuedBook("The Great Gatsby", "F. Scott Fitzgerald", "2023-01-01", "2023-01-15");
        issuedBook.displayIssuedBook();
    }}
