package src.main.java.com.adepuu.exercises.session10;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import src.main.java.com.adepuu.exercises.session10.user;

public class borrowProcess extends library{
    private LocalDate dateBorrow, dateReturn;
    private String dateA;
    private user User = new user();
    private int totalForfeit;

    public void calculateForfeit(long daysLend){
        setDateBorrow(LocalDate.parse(User.getDateB(), DateTimeFormatter.ISO_LOCAL_DATE));
        dateReturn = LocalDate.parse(getDateA(), DateTimeFormatter.ISO_LOCAL_DATE);
        Duration diff = Duration.between(getDateBorrow().atStartOfDay(), getDateReturn().atStartOfDay());
        long diffDays = diff.toDays();

        if (diffDays > daysLend){
            setTotalForfeit((int) (super.getForfeit() * (diffDays-daysLend)));
            System.out.println("You late to return the book!");
            System.out.println("You need to pay "+getTotalForfeit()+" as total forfeit.");
        } else {
            System.out.println("You return the book right on time.");
        }
    }

    public void bookReturn(Scanner input){
        System.out.println("\n==============================");
        System.out.println("Return your book here");
        System.out.println("==============================\n");



        System.out.println("Date you borrow: ");
        User.setDateB(input.next());


        System.out.println("Date you return: ");
        setDateA(input.next());

        System.out.println("How many days you can lend the book?");
        long daylends = input.nextLong();
        calculateForfeit(daylends);
    }

    public int getTotalForfeit(){ return totalForfeit; }

    public void setDateReturn(LocalDate dateReturn){
        this.dateReturn = dateReturn;
    }
    public LocalDate getDateReturn() {
        return dateReturn;
    }

    public String getDateA() {
        return dateA;
    }

    public void setDateA(String date) {
        this.dateA = date;
    }

    public LocalDate getDateBorrow() {
        return dateBorrow;
    }

    public void setDateBorrow(LocalDate dateBorrow) {
        this.dateBorrow = dateBorrow;
    }

    public void setTotalForfeit(int totalForfeit) {
        this.totalForfeit = totalForfeit;
    }
}