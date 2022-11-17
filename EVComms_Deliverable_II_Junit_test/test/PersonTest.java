import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    // Testing whether one person is within a certain radius of another person based off location.
    @Test
    public void isWithinRadiusOfOtherPersonWithSpecificLicensePlate() {
        Person personTesterOne = new Person("Aditya Guin", "1112223333",
                new Car("aaa0000", "blue", "toyota", "corolla", 10., 13.)
        );
        Person personTesterTwo = new Person("Nam Truong", "4445556666",
                new Car("123abca", "black", "honda", "civic", 42., 18.)
        );

        assertTrue("Nam is within 35 miles of Aditya", personTesterOne.isWithinRadiusOfOtherPersonWithSpecificLicensePlate(personTesterTwo, 35.0));
    }
}