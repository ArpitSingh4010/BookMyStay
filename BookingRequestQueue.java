import java.util.*;
public class BookingRequestQueue {
    
    private Queue<Reservation> requestQueue;
    public BookingRequestQueue(){
        requestQueue=new LinkedList<>();
    }

    public void addRequest(Reservation reservation){
        requestQueue.offer(reservation);
    }

    public Reservation getNextReservation(){
        return requestQueue.poll();
    }

    public boolean isEmpty(){
        return requestQueue.isEmpty();
    }
    public boolean hasPendingRequest(){
        return !requestQueue.isEmpty();
    }

}
