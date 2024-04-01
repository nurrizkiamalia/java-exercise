package src.main.java.com.adepuu.exercises.session10;

public class library extends book{
    private int totalBook, bookBorrowed, currentBook, forfeit;

    public int bookAvailable(){
        setTotalBook(20);
        setBookBorrowed(5);
        currentBook = getTotalBook() - getBookBorrowed();
        if (currentBook > totalBook){
            System.out.println("Book is not available");
        } else{
            System.out.println("Yes, the book is Available.");
        }

        return currentBook;
    }

    public void setBookName(String bookName){
        super.setBookName(bookName);
    }

    public String getBookName(){
        return super.getBookName();
    }

    public int getBookBorrowed() {
        return bookBorrowed;
    }

    public int getForfeit(){
        return 10000;
    }

    public int getTotalBook() {
        return totalBook;
    }

    public int getCurrentBook(){
        return  currentBook;
    }

    public void setTotalBook(int totalBook) {
        this.totalBook = totalBook;
    }

    public void setBookBorrowed(int bookBorrowed) {
        this.bookBorrowed = bookBorrowed;
    }
}
