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
public class BookStore {

    private String name;
    private ArrayList<Membership> memberships = new ArrayList<>();
    private ArrayList<PremiumMembership> PremuniumMembership = new ArrayList<>();
    public static ArrayList<Books> books = new ArrayList<>();
    public static ArrayList<Cd> cds = new ArrayList<>();
    
    /**
     * BookStore name
     *
     * @param name
     */
    public BookStore(String name) {
        this.name = name;
    }

    /**
     * add books to arraylist
     *
     * @param book
     */
    public void addBook(Books book) {
        books.add(book);

    }

    /**
     * Adds Person to the membership
     *
     * @param membership
     */
    public void addMembership(Membership membership) {
        memberships.add(membership);
    }

    /**
     * Adds member to be premium
     *
     * @param membership
     */
    public void addPreMembership(PremiumMembership membership) {
        memberships.add(membership);

    }

    /**
     * add cds to arraylist
     *
     * @param cd
     */
    public void addCd(Cd cd) {
        cds.add(cd);

    }

    /**
     * Prints list of books for selection Major function
     */
    public void printBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(i + " " + books.get(i).getName() + " by: " + books.get(i).getAuthor()
                    + " for $" + books.get(i).getPrice() + "0");
        }
    }

    /**
     * Prints list of cds for selection Major function
     */
    public void printCDs() {
        for (int i = 0; i < cds.size(); i++) {
            System.out.println(i + " " + cds.get(i).getName() + " by: " + cds.get(i).getAuthor()
                    + " for $" + cds.get(i).getPrice() + "0");

        }
    }

    /**
     * Prints out inventory
     */
    public void printInventory() {
        System.out.println("Amount of items in stock " + (books.size() + cds.size()));

    }

    /**
     * Makes the inventory
     */
    public void addRandomInventory() {

        books.add(new Books("Darling in the Franxx", "Kentaro Yabuki", 6.00));
        books.add(new Books("The Promised Neverland", "Kaiu Shirai", 8.00));
        books.add(new Books("devil may cry", "Suguro Chayamachi", 4.00));
        books.add(new Books("Mobile Suit Gundam 00", "(Kidou Senshi ", 12.00));
        books.add(new Books("Jon's Book", "Jon", 30.00));

        cds.add(new Cd("Lil Uzi Vert vs the world", "Lil Uzi Vert", 10.00));
        cds.add(new Cd("Deadroses", "Blackbear", 15.00));
        cds.add(new Cd("You will regret ", "Ski mask the god", 12.00));
        cds.add(new Cd("Take care", "Drake", 18.00));
        cds.add(new Cd("Worldwide", "Jay park", 10.00));

    }

}
