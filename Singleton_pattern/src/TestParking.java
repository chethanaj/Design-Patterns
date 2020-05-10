public class TestParking {

    public static void main(String[] args) {


        Park park = Park.getInstance();


        park.addVehicle(1234, "Honda");
        Vehicle vehicle = park.getVehicle(0);
        System.out.println(vehicle);
        System.out.println("No of Vehicles in the park: " + park.getNoOfVehicles());


        Park park1 = Park.getInstance();

        park1.addVehicle(8990, "BMW");
        Vehicle vehicle1 = park1.getVehicle(1);
        System.out.println(vehicle1);
        System.out.println("No of Vehicles in the park: " + park1.getNoOfVehicles());

        Park park2 = Park.getInstance();

        park2.addVehicle(1111, "Tesla");
        Vehicle vehicle2 = park1.getVehicle(2);
        System.out.println(vehicle2);
        System.out.println("No of Vehicles in the park: " + park2.getNoOfVehicles());
        System.out.println("Remove vehicle number " + vehicle2.getNumber() + " from the park");
        park2.removeVehicle(2);
        System.out.println("No of Vehicles in the park: " + park2.getNoOfVehicles());

    }
}
