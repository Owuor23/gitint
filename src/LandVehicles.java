public class LandVehicles extends Vehicle {
    private  int numberOfWheels;
    private String fuel;
    private String purpose;



    public LandVehicles(String name, String manufacturer, int capacity, int numberOfWheels, String fuel, String purpose) {
        super(name, manufacturer, capacity);
        this.numberOfWheels = numberOfWheels;
        this.fuel = fuel;
        this.purpose = purpose;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public void printVehicleDetails() {
        System.out.println("Type is:"+getName()+"Manufacture is:"+getManufacturer()+"Capacity is:"+getCapacity()+
                "Number of wheels is:"+getNumberOfWheels()+"Type of fuel is:"+getFuel()+"Purpose of vehicle is:"+getPurpose());
    }
}
