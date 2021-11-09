package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given
        Dog dog = new Dog("Sammy", new Date(), 45);
        String expected = "Sammy";
        dog.setName(expected);

        // When
        String actual = dog.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        // Given
        Dog dog = new Dog("Sammy", new Date(), 45);
        String expected = "bark!";


        // When
        String actual = dog.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        // Given
        Dog dog = new Dog("Sammy", new Date(), 45);
        Food treats = new Food();
        dog.eat(treats);
        Integer expected = 1;

        // When
        Integer actual = dog.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest() {
        // Given
        Dog dog = new Dog("Sammy", new Date(), 45);
        Integer expected = 45;

        // When
        Integer actual = dog.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
