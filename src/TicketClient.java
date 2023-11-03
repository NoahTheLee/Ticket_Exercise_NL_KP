public class TicketClient {

    public static void main(String[] args){

        Ticket kipTicket = new Ticket(40.0, 42069);
        Ticket noahTicket = new Ticket(20);
        Ticket jesusTicket = new Ticket(30.4);

        System.out.println("===Normal Tickets===");
        System.out.println(kipTicket);
        System.out.println(noahTicket);
        System.out.println(jesusTicket);
        System.out.println("===Normal Tickets===");



        WalkupTicket kipWalkup = new WalkupTicket(40.0, 42069);
        WalkupTicket noahWalkup = new WalkupTicket(20);
        WalkupTicket jesusWalkup = new WalkupTicket(30.4);

        System.out.println("===Walkup Tickets===");
        System.out.println(kipWalkup);
        System.out.println(noahWalkup);
        System.out.println(jesusWalkup);
        System.out.println("===Walkup Tickets===");

    }
}
