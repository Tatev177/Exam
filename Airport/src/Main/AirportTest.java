package Main;

import Model.Plane;
import Service.PlaneService;

public class AirportTest {
    public static void main(String[] args) {
        PlaneService service = new PlaneService();
        Plane plane1 = service.create();
        System.out.println("-----------------------------");
        System.out.println("Task 1");
        plane1.printInfo();
        Plane plane2 = service.create();
        plane2.printInfo();
        Plane plane3 = service.create();
        plane3.printInfo();

        System.out.println("-----------------------------");
        System.out.println("Task 2");
        service.isMilitary(plane1);

        System.out.println("-----------------------------");
        System.out.println("Task 3");
        service.newerPlane(plane1, plane2);

        System.out.println("-----------------------------");
        System.out.println("Task 4");
        service.biggerWingspan(plane1, plane2);
        Plane[] planes = {plane1, plane2, plane3};

        System.out.println("-----------------------------");
        System.out.println("Task 5");
        service.smallestSeats(planes);

        System.out.println("-----------------------------");
        System.out.println("Task 6");
        service.militaryPlanes(planes);

        System.out.println("-----------------------------");
        System.out.println("Task 7");
        service.mPlanes(planes);

        System.out.println("-----------------------------");
        System.out.println("Task 8");
        service.minWeight(planes);

        System.out.println("-----------------------------");
        System.out.println("Task 9");
        service.minCost(planes);

        System.out.println("-----------------------------");
        System.out.println("Task 10");
        service.function(planes);


    }
}
