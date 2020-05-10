
public class Park {

    private static final int MAX_VEHICLE = 10;
    private static volatile Park parkInstance;
    private Vehicle[] vehicles;
    private int noOfVehicles;


    private Park() {
        vehicles = new Vehicle[MAX_VEHICLE];
        noOfVehicles = 0;
    }

    public static Park getInstance() {

        if (parkInstance == null) {

            synchronized (Park.class) {
                if (parkInstance == null) {
                    parkInstance = new Park();
                }
            }
        }

        return parkInstance;
    }

    public void addVehicle(int num, String name) {
        int i = noOfVehicles++;
        vehicles[i] = new Vehicle(num, name);

    }

    public Vehicle getVehicle(int vehicle_index) {
        return vehicles[vehicle_index];

    }

    public int getNoOfVehicles() {
        return noOfVehicles;
    }

    public Vehicle[] removeVehicle(int index) {
        if (vehicles == null || index < 0 || index >= vehicles.length) {

            return vehicles;
        }

        Vehicle[] anotherArray = new Vehicle[vehicles.length];

        for (int i = 0, k = 0; i < vehicles.length; i++) {

            if (i == index) {
                --noOfVehicles;
                continue;
            }

            anotherArray[k++] = vehicles[i];
        }


        vehicles = anotherArray;
        return vehicles;

    }
}
