package src.main.java.com.adepuu.exercises.session10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class user {
    private String username, dateB;
    private library Library = new library();
    private int bookBorrowed;
    private LocalDate dateBorrowed;

    public void inputBorrowingSys(Scanner in){
        System.out.print("my name is\t\t: ");
        setUsername(in.next());
        in.nextLine();
        System.out.print("Book to lend\t: ");
        Library.setBookName(in.next());
        System.out.print("How much book?\t ");
        setBookBorrowed(in.nextInt());
        Library.setBookBorrowed(Library.getBookBorrowed()+getBookBorrowed());

        System.out.println("Book borrowed now add to "+Library.getBookBorrowed());

        System.out.println("Is the book Available? ");
        Library.bookAvailable();

        System.out.println(getUsername()+" has borrow "+Library.getBookName()+" for "+getBookBorrowed()+" book ");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getBookBorrowed() {
        return bookBorrowed;
    }

    public void setBookBorrowed(int bookBorrowed) {
        this.bookBorrowed = bookBorrowed;
    }

    public String getDateB() {
        return dateB;
    }

    public void setDateB(String dateB) {
        this.dateB = dateB;
    }


}
