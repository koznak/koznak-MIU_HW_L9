package L9.Prob4;

import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    private Queue<Ticket> ticketQueue;
    private int nextId;

    public TicketingSystem() {
        this.ticketQueue = new LinkedList<>();
        this.nextId = 1;
    }

    public void addTicket(String description) {
        Ticket newT = new Ticket(nextId++, description);
        ticketQueue.add(newT);
        System.out.println("Added ticket: " + newT);
    }

    public Ticket processTicket() {
        Ticket pt = ticketQueue.poll();
        if (pt != null) {
            System.out.println("Processed ticket: " + pt);
        } else {
            System.out.println("No tickets to process.");
        }
        return pt;
    }

    public Ticket viewNextTicket() {
        Ticket nt = ticketQueue.peek();
        if (nt != null) {
            System.out.println("Next ticket to process: " + nt);
        } else {
            System.out.println("The queue is empty. No next ticket to view.");
        }
        return nt;
    }

    public int getQueueSize() {
        return ticketQueue.size();
    }
}
