public class Flight {

    private String flightNumber;
    private String destination;
    private int departure;

    Flight(){}

    Flight(String flightNumber, String destination, int departure){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
    }


    public String getDestination(){
        return destination;
    }
    public String getFlightNumber(){
        return flightNumber;
    }
    public int getDeparture(){
        return departure;
    }



}
