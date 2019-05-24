public class Main {



    public static void main(String[] args) {

     // Vehicle vehicle1=new Vehicle();
     // vehicle1.printVehicleDetails();

      LandVehicles landvehicles=new LandVehicles("bus","simon","23","4","petro","private");
      landvehicles.printVehicleDetails();

      WaterVehicles watervehicles=new WaterVehicles();
      watervehicles.printVehicleDetails();

      AirVehicles airvehicles=new AirVehicles();
      airvehicles.printVehicleDetails();


    }
}
