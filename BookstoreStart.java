/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstorestart;

import java.util.Scanner;

/**
 *
 * @author Jonathan Nguyen
 */
public class BookstoreStart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * sets up the store and inventory
         */
        BookStore store = new BookStore("Welcome to Jon's Store");
        store.addRandomInventory();
        Membership member = null;

        Scanner scan = new Scanner(System.in);
        System.out.println("Whats your name?");
        String name = scan.nextLine();

        Scanner paymentScan = new Scanner(System.in);
        System.out.println("Whats your payment Method?");
        String payment = paymentScan.nextLine();

        /**
         * Asks if a Premium Member and adds fee of 20 dollars
         */
        System.out.println("Would you like to be a premium member?");
        Scanner sca = new Scanner(System.in);
        char ans = sca.next().charAt(0);
        if ((ans == 'Y') || (ans == 'y')) {
            member = new PremiumMembership(name, payment);
            System.out.println("Membership fee $20");
            member.freeBook(store.books.get(0));
            System.out.println("You have gotten " + store.books.get(0).getName() + " for free");

        }
        if ((ans == 'N') || (ans == 'n')) {
            member = new Membership(name, payment);
        }

        System.out.println("Welcome " + member.getName());

        int i = 5;
        /**
         * keeps loop running
         */
        while (i > 0) {
            /**
             * selection menu for to buy or return
             */

            System.out.println("What would you like to do?");
            System.out.println("1. Buy Book");
            System.out.println("2. Buy CD");
            System.out.println("3. Return Book");
            System.out.println("4. Return a CD");
            System.out.println("5. Check inventory");
            int ch = sca.nextInt();

            /**
             * Lets you select books or cds
             */
            switch (ch) {

                /**
                 * book selection. Removes book from array list and adds into a
                 * cart
                 */
                case 1:
                    store.printBooks();
                    System.out.println("Choose book number");
                    Scanner bookScanner = new Scanner(System.in);
                    int bookChoice = (bookScanner.nextInt());
                    Books book = store.books.get(bookChoice);
                    member.boughtBook(book);
                    store.books.remove(book);
                    System.out.println(member.getName() + " has purchased "
                            + book.getName() + " for $" + book.getPrice());
                    System.out.println(member.getName() + "'s new total spent"
                            + " is $" + member.getTotalSpent() + " by " + member.getPaymentMethod());
                    break;
                /**
                 * Cd selection.Removes Cd from arraylist and adds into a cart
                 */
                case 2:
                    store.printCDs();
                    System.out.println("Choose CD number");
                    Scanner cdScanner = new Scanner(System.in);
                    int cdChoice = (cdScanner.nextInt());
                    Cd cd = store.cds.get(cdChoice);
                    member.boughtCd(cd);
                    store.cds.remove(cd);
                    System.out.println(member.getName() + " has purchased "
                            + cd.getName() + " for $" + cd.getPrice());
                    System.out.println(member.getName() + "'s new total spent"
                            + " is $" + member.getTotalSpent() + " by " + member.getPaymentMethod());
                    break;
                /**
                 * Returns books
                 */
                case 3:
                    member.printBooks();
                    System.out.println("Choose book number");
                    Scanner bookRScanner = new Scanner(System.in);
                    int bookRChoice = (bookRScanner.nextInt());
                    Books returnBook = member.BoughtBooks.get(bookRChoice);
                    member.BoughtBooks.remove(returnBook);
                    store.addBook(returnBook);
                    System.out.println(member.getName() + " has returned "
                            + returnBook.getName() + " for $" + returnBook.getPrice());
                    System.out.println(member.getName() + "'s new total spent"
                            + " is $" + member.getTotalSpent());

                    break;
                /**
                 * Returns Cds
                 */

                case 4:
                    member.printCDs();
                    System.out.println("Choose CD number");
                    Scanner cdRScanner = new Scanner(System.in);
                    int cdRChoice = (cdRScanner.nextInt());
                    Cd returnCD = member.BoughtCds.get(cdRChoice);
                    member.BoughtCds.remove(returnCD);
                    store.addCd(returnCD);
                    System.out.println(member.getName() + " has returned "
                            + returnCD.getName() + " for $" + returnCD.getPrice());
                    System.out.println(member.getName() + "'s new total spent"
                            + " is $" + member.getTotalSpent());
                    break;

                case 5:
                    store.printInventory();
                    break;

                default:

            }

            /**
             * Selection menu to keep shopping
             */
            System.out.println("Would like to keep shopping ");
            System.out.println("1. Yes");
            System.out.println("2. No");

            Scanner keepShopping = new Scanner(System.in);
            int shop = keepShopping.nextInt();
            if (shop == 2) {
                i = -1;
            }
        }

    }

}
