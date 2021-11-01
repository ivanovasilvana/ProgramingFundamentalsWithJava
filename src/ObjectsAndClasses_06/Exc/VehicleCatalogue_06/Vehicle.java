package ObjectsAndClasses_06.Exc.VehicleCatalogue_06;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsepower;

    public Vehicle(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }
    public int getHorsepower(){
        return horsepower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%n" +
                "Model: %s%nColor: %s%n" +
                "Horsepower: %d", type, model, color, horsepower);
    }

    public void setType(String type) {
        this.type = type;
    }
}
