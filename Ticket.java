package CS4TruthRevis;

public class Ticket {
    private String location;
    private String seat;
    private String date;
    private int number;
    
    public Ticket(String location, String seat, String date, int number){
        this.location = location;
        this.seat = seat;
        this.date = date;
        this.number = number;
    }      

    public String getLocation() {
        return location;
    }

    public String getSeat() {
        return seat;
    }

    public String getDate() {
        return date;
    }

    public int getNumber() {
        return number;
    }
}