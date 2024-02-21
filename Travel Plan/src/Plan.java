import java.util.ArrayList;
import java.util.List;

public class Plan {

    private String destination;
    private List<Flight> flights = new ArrayList<>();
    private List<Hotel> hotels = new ArrayList<>();

    Plan (){}
    Plan(String destination){
        this.destination = destination;
    }

    public void addHotel(Hotel H){
        hotels.add(H);
    }
    public void addFlight(Flight F){
        flights.add(F);
    }

    public void findPlan(String destination /*Flight f, Hotel h*/){

        for (int i = 0 ; i < flights.size(); i++){
            for (int j = 0; j < hotels.size(); j++){
                if (flights.get(i).getDestination().equals(hotels.get(j).getLocation()) &&
                        flights.get(i).getDestination().equals(destination)){
                    System.out.println("you can reach your destination on flight "
                            + flights.get(i).getFlightNumber()
                            + " at hotel "
                            + hotels.get(j).getName());
                }

            }
        }
        /*
        List<Flight> fs = new ArrayList<>();
        fs.add(f);
        destination = this.destination;

        List <String> newFs = new ArrayList<>();
        List <String> newHs = new ArrayList<>();

        System.out.println("Configuring Plan");

        for(Flight p: fs){
            if(p.getDestination().equals(destination)){
                newFs.add(p.getFlightNumber());

                for(Hotel x: hs){
                    if(x.getLocation().equals(destination)){
                        newHs.add(x.getName());
                        System.out.println("You can get to your destination using flight " + p.getFlightNumber() + " at " + p.getDeparture() + " and using hotel " + x.getName());
                    }
                    else System.out.println("no hotels at this destination");
                }
            }
            else if (fs.isEmpty()) System.out.println("Empty");
            else System.out.println("invalid destination");
        }

        //if(!newHs.isEmpty() && !newFs.isEmpty()) {
            for (String z : newFs) {
                System.out.println(z);
                for (String i : newHs) {
                    System.out.println(i);
                }
            }
        //}
        */
    }



}
