package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void addDogsTest() {
        // given
        DogHouse.clear();
        Dog dog = new Dog("Sammy", new Date(), 27);
        DogHouse.add(dog);
        int expected = 1;

        // when
        int actual = DogHouse.getNumberOfDogs();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByIdTest() {
        // given
        DogHouse.clear();
        Dog dog = new Dog("Sammy", new Date(), 27);
        DogHouse.add(dog);
        DogHouse.remove(27);
        int expected = 0;

        // when
        int actual = DogHouse.getNumberOfDogs();

        // then
        Assert.assertEquals(expected, actual);

    }


    @Test
    public void removeDogTest() {
        // given
        DogHouse.clear();
        Dog dog = new Dog("Sammy", new Date(), 27);
        DogHouse.add(dog);
        DogHouse.remove(dog);
        int expected = 0;

        // when
        int actual = DogHouse.getNumberOfDogs();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogByIdTest() {
        // given
        DogHouse.clear();
        Dog dog = new Dog("Sammy", new Date(), 27);
        DogHouse.add(dog);
        DogHouse.getDogById(27);
        Integer expected = 27;

        // when
        Integer actual = dog.getId();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfDogsTest() {
        // given
        DogHouse.clear();
        Dog dog = new Dog("Sammy", new Date(), 27);
        DogHouse.add(dog);
        int expected = 1;

        // when
        int actual = DogHouse.getNumberOfDogs();

        // then
        Assert.assertEquals(expected, actual);
    }
}
