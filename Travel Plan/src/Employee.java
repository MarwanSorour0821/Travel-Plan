public class Employee {

    private String name;
    private String jobTitle;
    private int salary;

    Employee(){}

    Employee(String name, String jobTitle){
        this.name = name;
        this.jobTitle = jobTitle;

    }

    public int getSalary() {return salary;}

    public int calSalary(){
        if (jobTitle == "Manager") {
            salary = 12 * 4000;
            return salary;
        }

        else if (jobTitle == "Engineer"){
            salary = 12 * 10000;
            return salary;
        }
        else return 0;

    }



}
