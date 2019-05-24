public class WaterVehicles extends Vehicle {
    private int numberOfPropellers;
    private String depth;


    public WaterVehicles(String name, String manufacturer, int capacity, int numberOfPropellers, String depth) {
        super(name, manufacturer, capacity);
        this.numberOfPropellers = numberOfPropellers;
        this.depth = depth;
    }

    public int getNumberOfPropellers() {
        return numberOfPropellers;
    }

    public void setNumberOfPropellers(int numberOfPropellers) {
        this.numberOfPropellers = numberOfPropellers;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    @Override
    public void printVehicleDetails() {
        System.out.println("Type is:"+getName()+"Manufacture is:"+getManufacturer()+"Capacity is:"+getCapacity()+
                "Number of propellors is:"+getNumberOfPropellers()+"Depth is:"+getDepth());
    }
}
