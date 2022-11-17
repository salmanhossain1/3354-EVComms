public class Car {
    private String license_plate;
    private String color;
    private String make;
    private String model;
    private double x;
    private double y;

    public Car(String license_plate, String color, String make, String model, double x, double y) {
        this.license_plate = license_plate;
        this.color = color;
        this.make = make;
        this.model = model;
        this.x = x;
        this.y = y;
    }

    public String getLicense_plate() {
        return license_plate;
    }

    public void setLicense_plate(String license_plate) {
        this.license_plate = license_plate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLocation(){
        return "(" + x + ", " + y + ")";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Car(){
        license_plate = "NULL";
        color = "NULL";
        make = "NULL";
        model = "NULL";
        x = 0.;
        y = 0.;
    }

}
