public class UseCase2RoomInitialization extends UseCase1HotelBookingApp {
    public static void main(String[] args) {
        System.out.println("Hotel Room Initialization");
        SingleRoom sroom=new SingleRoom();
        DoubleRoom droom=new DoubleRoom();
        SuiteRoom suroom=new SuiteRoom();
        sroom.displayRoomDetails();
        System.out.println("***************************");
        droom.displayRoomDetails();
        System.out.println("***************************");
        suroom.displayRoomDetails();
        System.out.println("***************************");

}
    
}
