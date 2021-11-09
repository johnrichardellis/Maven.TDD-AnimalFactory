package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`  // parent child relationship
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`  // parent child




    @Test
    public void setNameTest() {
        // given
        Cat cat = new Cat("Henry", new Date(), 12);
        cat.setName("Chuckie");
        String expected = "Chuckie";

        // when
        String actual = cat.getName();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        // given
        Cat cat = new Cat("Henry", new Date(), 12);
        cat.speak();
        String expected = "meow!";

        // when
        String actual  = cat.speak();

        // then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setBirthDateTest() {
        // given
        Cat cat = new Cat("Henry", new Date(), 12);
        Date expected = new Date(1-1-2021);
        cat.setBirthDate(expected);

        // when
        Date actual = cat.getBirthDate();

        // then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void eatTest() {
        // given
        Cat cat = new Cat("Henry", new Date(), 12);
        Food treats = new Food();
        cat.eat(treats);
        Integer expected = 1;

        // when
        Integer actual = cat.getNumberOfMealsEaten();

        // then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void getIdTest() {
        // given
        Cat cat = new Cat("Henry", new Date(), 12);
        Integer expected = 12;

        // when
        Integer actual = cat.getId();

        // then
        Assert.assertEquals(expected, actual);

    }
}
