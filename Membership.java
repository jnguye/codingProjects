/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstorestart;

import java.util.ArrayList;

/**
 *
 * @author Jonathan Nguyen
 */
public class Membership {

    private String name;
    private String paymentMethod;
    public ArrayList<Books> BoughtBooks = new ArrayList<>();
    public ArrayList<Cd> BoughtCds = new ArrayList<>();
    double totalSpent = 0;

    public Membership(String name, String paymentMethod) {
        this.name = name;
        this.paymentMethod = paymentMethod;
    }

    public void boughtBook(Books book) {
        BoughtBooks.add(book);
        totalSpent += book.getPrice();

    }

    public void boughtCd(Cd cd) {
        BoughtCds.add(cd);
        totalSpent += cd.getPrice();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void freeBook(Books book) {
        BoughtBooks.add(book);

    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public double getTotalSpent() {
        return totalSpent;
    }

    
    /**
     * Prints out books
     * Major function
     */
    public void printBooks() {
        if (BoughtBooks.isEmpty()) {
            System.out.println("You have no books");
            return;
        }
        for (int i = 0; i < BoughtBooks.size(); i++) {
            System.out.println(i + " " + BoughtBooks.get(i).getName() + " by: " + BoughtBooks.get(i).getAuthor()
                    + " for $" + BoughtBooks.get(i).getPrice() + "0");
        }
    }
/**
 * Prints out cds
 * major function
 */
    public void printCDs() {
        if (BoughtCds.isEmpty()) {
            System.out.println("You have no CDs");
            return;
        }
        for (int i = 0; i < BoughtCds.size(); i++) {
            System.out.println(i + " " + BoughtCds.get(i).getName() + " by: " + BoughtCds.get(i).getAuthor()
                    + " for $" + BoughtCds.get(i).getPrice() + "0");

        }
    }

}
