public class UseCase4RoomSearch {
    public static void main(String[] args) {
        System.out.println("Hotel Room Search");
        RoomInventory r=new RoomInventory();
        String searchType="Double Room";
        System.out.println("Searching for: "+searchType);
        if(r.getRoomAvailability(searchType)>0){
            System.out.println(searchType+" is available.");
        }else{
            System.out.println(searchType+" is not available.");
        }
    }
    
}
