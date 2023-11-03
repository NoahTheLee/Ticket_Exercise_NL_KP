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

        AdvanceTicket kipAdvanceEarly = new AdvanceTicket(40, 42069, 15);
        AdvanceTicket kipAdvanceLate = new AdvanceTicket(40, 420691, 5);
        AdvanceTicket noahAdvanceEarly = new AdvanceTicket(20, 15);
        AdvanceTicket noahAdvanceLate = new AdvanceTicket(20, 5);
        AdvanceTicket jesusAdvanceEarly = new AdvanceTicket(30.4, 15);
        AdvanceTicket jesusAdvanceLate = new AdvanceTicket(30.4,5);

        System.out.println("===Advance Tickets===");
        System.out.println(kipAdvanceEarly);
        System.out.println(kipAdvanceLate);
        System.out.println(noahAdvanceEarly);
        System.out.println(noahAdvanceLate);
        System.out.println(jesusAdvanceEarly);
        System.out.println(jesusAdvanceLate);
        System.out.println("===Advance Tickets===");

        StudentAdvanceTicket kipStudentAdvanceEarly = new StudentAdvanceTicket(40, 42069, 15);
        StudentAdvanceTicket kipStudentAdvanceLate = new StudentAdvanceTicket(40, 420691, 5);
        StudentAdvanceTicket noahStudentAdvanceEarly = new StudentAdvanceTicket(20, 15);
        StudentAdvanceTicket noahStudentAdvanceLate = new StudentAdvanceTicket(20, 5);
        StudentAdvanceTicket jesusStudentAdvanceEarly = new StudentAdvanceTicket(30.4, 15);
        StudentAdvanceTicket jesusStudentAdvanceLate = new StudentAdvanceTicket(30.4,5);

        System.out.println("===Advance Tickets===");
        System.out.println(kipStudentAdvanceEarly);
        System.out.println(kipStudentAdvanceLate);
        System.out.println(noahStudentAdvanceEarly);
        System.out.println(noahStudentAdvanceLate);
        System.out.println(jesusStudentAdvanceEarly);
        System.out.println(jesusStudentAdvanceLate);
        System.out.println("===Advance Tickets===");

    }
}
