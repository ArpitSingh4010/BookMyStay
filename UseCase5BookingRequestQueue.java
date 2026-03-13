
public class UseCase5BookingRequestQueue extends BookingRequestQueue {
    public static void main(String[] args) {
        System.out.println("Hotel Booking Request Queue");
        BookingRequestQueue bookingRequestQueue=new BookingRequestQueue();
        Reservation r1=new Reservation("Abhi", "Single Room");
        Reservation r2=new Reservation("Subha", "Double Room");

        Reservation r3=new Reservation("Vanmati", "Suite Room");

        bookingRequestQueue.addRequest(r1);
        bookingRequestQueue.addRequest(r2);

        bookingRequestQueue.addRequest(r3);


        while(bookingRequestQueue.hasPendingRequest()){
            Reservation req= bookingRequestQueue.getNextReservation();
            System.out.println("Processing booking request for: "+req.getGuestName()+" - "+req.getRoomType());
            System.out.println("Booking request processed for: "+req.getGuestName()+" - "+req.getRoomType());

        }

    }
}
