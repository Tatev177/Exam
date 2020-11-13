package Model;

public class Plane {
//    Plane (score 10)
//    model - name of the plane (Any not empty string)
//    country - country the plane belongs to (Any not empty string)
//    year - year of publishing  (from 1903 to 2020)
//    hours - hours in air (from 0 to 10000)
//    military - is military or not
//    weight - weight of plane (from 1000 KG to 160000 KG)
//    wingspan - the maximum extent across the wings of an aircraft (from 10 - 45)
//    topSpeed - maximal speed per hour (1000 km/h) (any not negative value)
//    seats - number of seats (any not negative value)
//    cost - cost of the plane (ex: 445.6$) (any not negative value)

    private String model = "Boeing745";
    private String country = "USA";
    private int year = 1967;
    private int hours = 13;
    private boolean military = false;
    private int weight;
    private int wingspan;
    private int topSpeed;
    private int seats;
    private double cost;

    public Plane() {

    }

    public Plane(String model, String country, int year, int hours, boolean military, int weight, int wingspan, int topSpeed, int seats, double cost) {
        this.model = model;
        this.country = country;
        this.year = year;
        this.hours = hours;
        this.military = military;
        this.weight = weight;
        this.wingspan = wingspan;
        this.topSpeed = topSpeed;
        this.seats = seats;
        this.cost = cost;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void printInfo(){
        System.out.println("Name:" + " " + model);
        System.out.println("Country:" + " " + country);
        System.out.println("Year:" + " " + year);
        System.out.println("Hours:" + " " + hours);
        System.out.println("Military:" + " " + military);
        System.out.println("Weight:" + " " + weight);
        System.out.println("Wingspan:" + " " + wingspan);
        System.out.println("TopSpeed:" + " " + topSpeed);
        System.out.println("Seats:" + " " + seats);
        System.out.println("Cost:" + " " + cost);
    }
}
