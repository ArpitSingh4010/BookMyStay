
import java.util.*;

public class RoomInventory {

    private Map<String,Integer> roomAvailability=new HashMap<>();


    public  RoomInventory(){
        this.roomAvailability.put("Single Room",5);
        this.roomAvailability.put("Double Room",3);
        this.roomAvailability.put("Suite Room",2);
    }



    public int  getRoomAvailability(String RoomType)
    {
        return roomAvailability.getOrDefault(RoomType,0);
    }

    public void updateAvailability(String RoomType,int count)
    {
        roomAvailability.put(RoomType, count);

    }
    
}
