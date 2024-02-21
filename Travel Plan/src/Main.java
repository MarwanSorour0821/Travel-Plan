import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        Book bo = new Book();
//
//        List<Book> books = new ArrayList<>();
//        bo.addBook(new Book("Harry Potter", "Marwan", 4932));
//        bo.addBook(new Book("Hatchet", "Lara", 3874));
//
//        bo.retBook();

//        Employee E = new Employee("Lara", "Manager");
//        Employee L = new Employee("Marwan", "Engineer");
//        E.calSalary();
//        L.calSalary();
//
//        System.out.println(E.getSalary());

        Flight NewYork = new Flight("NY12", "New York", 1500);
        Flight SanFrancisco = new Flight("SF43", "San Francisco", 1700);
        Flight SaudiArabia = new Flight("SA21", "Saudi Arabia", 1200);
        Flight NewYork2 = new Flight("NY13", "New York", 1300);

        Hotel Plaza = new Hotel("Plaza Hotel", "New York");
        Hotel Marriot = new Hotel("Marriot Hotel", "Saudi Arabia");
        Hotel Kempinski = new Hotel("Kempinski", "Saudi Arabia");
        Hotel Be = new Hotel("San Fran Hotel", "San Francisco");

        Plan p = new Plan();

        p.addHotel(Plaza);
        p.addHotel(Marriot);
        p.addHotel(Kempinski);
        p.addHotel(Be);

        p.addFlight(NewYork);
        p.addFlight(SanFrancisco);
        p.addFlight(SaudiArabia);
        p.addFlight(NewYork2);

        p.findPlan("Saudi Arabia");

        // p.findPlan(SaudiArabia, Marriot, "San Francisco");


    }
}