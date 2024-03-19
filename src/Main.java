import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus("Dugin Ilya Alekseevich",
                1, 66,
                "Mercedes", 2006, 100);
        Bus bus2 = new Bus("Romanov Ivan Igorevich",
                2, 66,
                "Mercedes", 2006, 200);
        Bus bus3 = new Bus("Parvadov Pavel Urievich",
                3, 54,
                "Mercedes", 2007, 300);
        Bus[] buses = {bus1, bus2, bus3};

        System.out.print("Input number of route: ");
        Scanner inputNumberOfRoute = new Scanner(System.in);
        int numberOfRoute = inputNumberOfRoute.nextInt();
        System.out.printf("Buses with given number of route %d: \n", numberOfRoute);
        for (Bus b: buses){
            if (b.NumberOfRoute == numberOfRoute){
                System.out.printf("Number of bus: %d\n", b.NumberOfBus);            }
        }

        System.out.print("Input mileage of bus: ");
        Scanner inputMileageOfBus = new Scanner(System.in);
        int mileageOfBus = inputMileageOfBus.nextInt();
        System.out.printf("Buses with more than the specified mileage %d: \n", mileageOfBus);
        for (Bus b: buses){
            if (b.Mileage > mileageOfBus){
                System.out.printf("Number of bus: %d\n", b.NumberOfBus);
            }
        }
    }
}

class Bus{
    public String FIODriver;
    public int NumberOfBus;
    public int NumberOfRoute;
    public String BusBrand;
    public int YearOfOperation;
    public int Mileage;

    Bus(String FIODriver, int NumberOfBus, int NumberOfRoute,
             String BusBrand, int YearOfOperation, int Mileage){
        this.FIODriver = FIODriver;
        this.NumberOfBus = NumberOfBus;
        this.NumberOfRoute = NumberOfRoute;
        this.BusBrand = BusBrand;
        this.YearOfOperation = YearOfOperation;
        this.Mileage = Mileage;
    }
}