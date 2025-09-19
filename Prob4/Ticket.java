package L9.Prob4;

public class Ticket {
    private int id;
    private String description;

    public Ticket(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + id + ", Description: " + description;
    }
}
