package rs.ac.uns.ftn.model;

public class Ticket {

    private String id;
    private Performance performance;
    private User user;
    private Seat seat;
    private double price;

    public Ticket() {
    }

    public Ticket(String id, Performance performance, User user, Seat seat, double price) {
        this.id = id;
        this.performance = performance;
        this.user = user;
        this.seat = seat;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Performance getPerformance() {
        return performance;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
