public class UseCase3InventorySetup extends RoomInventory {
    public static void main(String[] args) {
        System.out.println("Hotel Room Inventory Status");
        SingleRoom sRoom=new SingleRoom();
        DoubleRoom dRoom=new DoubleRoom();
        SuiteRoom suRoom=new SuiteRoom();
        RoomInventory r=new RoomInventory();
        System.out.println("Single Room:");
        sRoom.displayRoomDetails();
        System.out.println("Available: "+r.getRoomAvailability("Single Room"));
          System.out.println("***************************");
        System.out.println("Double Room:");
        dRoom.displayRoomDetails();
        System.out.println("Available: "+r.getRoomAvailability("Double Room"));
          System.out.println("***************************");
        System.out.println("Suite Room:");
        suRoom.displayRoomDetails();
        System.out.println("Available: "+r.getRoomAvailability("Suite Room"));
          System.out.println("***************************");

    }
    
}
