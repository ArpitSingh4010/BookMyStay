public class UseCase6RoomAllocationService extends RoomAllocationService {
    public static void main(String[] args) {
        RoomAllocationService allocationService=new RoomAllocationService();
        System.out.println("Room Allocation Processing");
       System.out.println(allocationService.confirmBooking("Abhi", "Single Room"));
       System.out.println(allocationService.confirmBooking("Subha", "Double Room"));
       System.out.println(allocationService.confirmBooking("Vanmati", "Suite Room"));
    }
}
