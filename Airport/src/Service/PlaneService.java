package Service;

import Model.Plane;

import java.util.Scanner;

public class PlaneService {

//    PlaneService
//    Task 1. (score 5)
//    Create function:
//    Parameter one Plane
//    Result: print all information of the plane

    public Plane create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name of plane");
        String model = scanner.next();
        System.out.println("enter country");
        String country = scanner.next();
        System.out.println("enter year: from 1903 to 2020");
        int year = scanner.nextInt();
        System.out.println("enter hours: from 0 to 10000");
        int hours = scanner.nextInt();
        System.out.println("enter military: true or false");
        boolean military = scanner.nextBoolean();
        System.out.println("enter weight: from 1000 KG to 160000 KG");
        int weight = scanner.nextInt();
        System.out.println("enter wingspan: from 10 - 45");
        int wingspan = scanner.nextInt();
        System.out.println("enter topSpeed: any not negative value");
        int topSpeed = scanner.nextInt();
        System.out.println("enter seats: any not negative value");
        int seats = scanner.nextInt();
        System.out.println("enter cost: any not negative value");
        double cost = scanner.nextDouble();

        Plane plane = new Plane(model, country, year, hours, military, weight, wingspan, topSpeed, seats, cost);
        return plane;

    }


//    Task 2. (score 5)
//    Create function:
//    Parameter one Plane
//    Result: print cost and topSpeed if the plane is military otherwise print model and country

    public void isMilitary(Plane p) {
        if (p.isMilitary()) {
            System.out.println(p.getCost());
            System.out.println(p.getTopSpeed());
        } else {
            System.out.println(p.getModel());
            System.out.println(p.getCountry());
        }

    }

//    Task 3. (score 7)
//    Create function:
//    Parameter two Planes
//    Result: return the plane which one is newer (if they have the same age return first one).

    public void newerPlane(Plane p1, Plane p2) {
        if (p1.getYear() >= p2.getYear()) {
            System.out.println("Newer plane is:" + " " + p1.getModel());
        } else {
            System.out.println("Newer plane is:" + " " + p2.getModel());
        }

    }

    //    Task 4. (score 7)
//    Create function:
//    Parameter two Planes
//    Result: return the model of the plane which has bigger wingspan (if they have the same - return second one).


    public void biggerWingspan(Plane p1, Plane p2) {
        if (p1.getWingspan() > p2.getWingspan()) {
            System.out.println("Bigger wingspan:" + " " + p1.getModel());
        } else {
            System.out.println("Bigger wingspan:" + " " + p2.getModel());
        }

    }

//    Task 5. (score 7)
//    Create function:
//    Parameter three Planes
//    Result: print country of the plane with smallest seats count (if they have the same - print first).

    public void smallestSeats(Plane[] planes) {
        Plane min = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getSeats() < min.getSeats()) {
                min = planes[i];
            }
        }
        System.out.println("Country is:" + min.getCountry());
    }

//    Task 6. (score 7)
//    Create function:
//    Parameter array of Planes
//    Result: print all not military planes.

    public void militaryPlanes(Plane[] planes) {
        for (Plane p : planes) {
            if (!p.isMilitary()) {
                p.printInfo();
            }
        }
    }

//    Task 7. (score 10)
//    Create function:
//    Parameter array of Planes
//    Result: print all military planes which were in air more than 100 hours.

    public void mPlanes(Plane[] planes) {
        for (Plane p : planes) {
            if (p.isMilitary() && p.getHours() >= 100) {
                p.printInfo();
            }
        }
    }

    //    Task 8. (score 10)
//    Create function:
//    Parameter array of Planes
//    Result: return the plane with minimal weight (if there are some of them return last one).
    public void minWeight(Plane[] planes) {
        Plane min = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getWeight() <= min.getWeight()) {
                min = planes[i];
            }
        }
        min.printInfo();
    }

    //    Task 9. (score 10)
//    Create function:
//    Parameter array of Planes
//    Result: return the plane with minimal cost from all military planes (if there are some of them return first one).
    public void minCost(Plane[] planes) {
        Plane min = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].isMilitary() && planes[i].getCost() < min.getCost()) {
                min = planes[i];
                continue;
            }
        }
        min.printInfo();
    }

//    Task 10. (score 12)
//    Create function:
//    Parameter array of Planes
//    Result: print planes in ascending form order by year


    public void function (Plane [] planes){
        for (int i = 0; i < planes.length ; i++) {
            for (int j = 0; j <planes.length ; j++) {
                if (planes[j].getYear() < planes[j+1].getYear()){
                    Plane x= planes[j];
                    planes[j] = planes[j+1];
                    planes[j+1] = x;
                }
            }

        }
        for (int i = 0; i < planes.length ; i++){
            System.out.print(planes[i] + " ");
            System.out.println();
        }
    }

}
