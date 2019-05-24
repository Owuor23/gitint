

public abstract class Vehicle {
    private String name;
    private String manufacturer;
    private int capacity;

    private Vehicle(){

    }
    public Vehicle(String name,String manufacturer,int capacity){
        this.name= name;
        this.manufacturer=manufacturer;
        this.capacity=capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String type) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void printVehicleDetails(){


        System.out.println("Name is:"+getName()+"Manufacture is:"+getManufacturer()+"Capacity is:"+getCapacity());
    }
}
