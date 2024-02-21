import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String name;
    private String location;

    List<Hotel> hotels = new ArrayList<>();

    Hotel(){}
    Hotel(String name, String location){
        this.name = name;
        this.location = location;
    }


    public String getLocation(){
        return location;
    }

    public String getName(){
        return name;
    }


}
