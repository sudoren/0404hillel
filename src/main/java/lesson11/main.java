package lesson11;

public class main {
    public static void main(String[] args) {
        String type = "TRAIN";
        String zone = "zone3";
        int tariff = TicketMachine.calculateFare(type, zone);

        System.out.println("Ticket for "+ type + " to " + zone + " will cost " + tariff + " dollars");

    }
}
