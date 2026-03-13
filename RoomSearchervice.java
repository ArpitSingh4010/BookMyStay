

public class RoomSearchervice {
    public void searchAvailableRooms(RoomInventory inventory, Room SingleRoom, Room DoubleRoom, Room SuiteRoom){
        int singleAvailability = inventory.getRoomAvailability("Single Room");
        if(singleAvailability > 0){
            System.out.println("Available Single Rooms: " + singleAvailability);
            SingleRoom.displayRoomDetails();
        }else{
            System.out.println("No Single Rooms available.");
        }
        int doubleAvailability = inventory.getRoomAvailability("Double Room");
        if(doubleAvailability > 0){
            System.out.println("Available Double Rooms: " + doubleAvailability);
            DoubleRoom.displayRoomDetails();
        }else{
            System.out.println("No Double Rooms available.");
        }
        int suiteAvailability = inventory.getRoomAvailability("Suite Room");
        if(suiteAvailability > 0){
            System.out.println("Available Suite Rooms: " + suiteAvailability);
            SuiteRoom.displayRoomDetails();
        }else{
            System.out.println("No rooms available.");
        }
    }
       
       
}
