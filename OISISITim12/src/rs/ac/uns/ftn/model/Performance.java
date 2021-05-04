package rs.ac.uns.ftn.model;

import java.util.Date;
import java.util.HashMap;

public class Performance {

    private String id;
    private String name;
    private String description;
    private Date dateTime;
    private double price;
    private HashMap<Seat, Ticket> seats;
    private boolean soldOut;

    public Performance(){}

    public Performance(String id, String name, String description, Date dateTime, double price, HashMap<Seat, Ticket> seats, boolean soldOut) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dateTime = dateTime;
        this.price = price;
        this.seats = seats;
        this.soldOut = soldOut;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public HashMap<Seat, Ticket> getSeats() {
        return seats;
    }

    public void setSeats(HashMap<Seat, Ticket> seats) {
        this.seats = seats;
    }

    public boolean isSoldOut() {
        return soldOut;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }
}
