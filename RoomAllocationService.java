import java.util.*;

public class RoomAllocationService {

    private Set<String> allocatedRoomIds = new HashSet<>();

    
    private String generateRoomId(String roomType){
        String roomId = roomType.replaceAll(" ","_") + "_" + (allocatedRoomIds.size() + 1);
        allocatedRoomIds.add(roomId);
        return roomId;
    }


    public String confirmBooking(String guestName, String roomType){
        String roomId = generateRoomId(roomType);
        return "Booking Confirmed for Guest: " + guestName + ", Room ID: " + roomId;
    }
}