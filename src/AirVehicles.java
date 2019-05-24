public class AirVehicles extends Vehicle {
    private int numberOfEngines;
    private String type;


    public AirVehicles(String name, String manufacturer, int capacity, int numberOfEngines, String type) {
        super(name, manufacturer, capacity);
        this.numberOfEngines = numberOfEngines;
        this.type = type;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void printVehicleDetails() {
        System.out.println("Type is:"+getName()+"Manufacture is:"+getManufacturer()+"Capacity is:"+getCapacity()+
                "Number of engine is:"+getNumberOfEngines()+"Type is:"+getType());
    }
}
