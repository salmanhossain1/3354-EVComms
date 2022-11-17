import java.util.ArrayList;
import java.util.Objects;

public class Person {
    private String name;
    private String phone_number;
    private Car car_owned;

    public Person(String name, String phone_number, Car car_owned) {
        this.name = name;
        this.phone_number = phone_number;
        this.car_owned = car_owned;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Car getCar_owned() {
        return car_owned;
    }

    public void setCars_owned(Car car_owned) {
        this.car_owned = car_owned;
    }

    public boolean isWithinRadiusOfOtherPersonWithSpecificLicensePlate(Person person, double radius){
        Car theirCar = person.getCar_owned();
        double xchange = theirCar.getX() - getCar_owned().getX();
        double ychange = theirCar.getY() - getCar_owned().getY();
        xchange *= xchange;
        ychange *= ychange;
        double sum = xchange + ychange;
        return Math.sqrt(sum) <= radius;
    }
}
