package L9.Prob4;

public class TestTicketingSystem {
    public static void main(String[] args) {
        TicketingSystem system = new TicketingSystem();

        System.out.println("-------------- Adding Tickets --------------");
        system.addTicket("account login issue.");
        system.addTicket("help for product refund.");
        system.addTicket("Inquiry about a recent order.");
        System.out.println("Queue size: " + system.getQueueSize());

        System.out.println("-------------- Viewing Next Ticket --------------");
        system.viewNextTicket();
        System.out.println("Queue size is still: " + system.getQueueSize());

        System.out.println("-------------- Processing Tickets --------------");
        system.processTicket();
        System.out.println("Queue size: " + system.getQueueSize());

        system.processTicket();
        System.out.println("Queue size: " + system.getQueueSize());

        System.out.println("-------------- Adding a New Ticket --------------");
        system.addTicket("Password reset request.");
        System.out.println("Queue size: " + system.getQueueSize());

        System.out.println("-------------- Final Processing --------------");
        system.processTicket();
        system.processTicket();
        system.processTicket();
        System.out.println("Final queue size: " + system.getQueueSize());
    }
}
