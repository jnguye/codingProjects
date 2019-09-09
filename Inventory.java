/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstorestart;

/**
 *
 * @author Jonathan Nguyen
 */
public class Inventory {

    private String name;
    private String author;
    private double price;
    private String artist;
    private String album;

    public Inventory(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printinfo() {
        System.out.println(this.getName()
                + " by " + this.getAuthor()
                + " for $" + this.getPrice());

    }

}
