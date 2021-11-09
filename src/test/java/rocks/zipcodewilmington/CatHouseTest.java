package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


    @Test
    public void addCatTest() {      // given the expected cat, when the expected cat is added to cat house, then we check the cat house to see if there is the added cat
        // given
        CatHouse.clear();
        Cat cat = new Cat("Henry", new Date(), 12 );
        CatHouse.add(cat);
        Integer expected = 1;
        // when
        Integer actual = CatHouse.getNumberOfCats();
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatTest() {
        // given
        CatHouse.clear();
        Cat cat = new Cat("Henry", new Date(), 12 );
        CatHouse.add(cat);
        CatHouse.remove(12);
        Integer expected = 0;

        // when
        Integer actual = CatHouse.getNumberOfCats();

        // then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void remove() {
        // given
        CatHouse.clear();
        Cat cat = new Cat("Henry", new Date(), 12 );
        CatHouse.add(cat);
        CatHouse.remove(12);
        Integer expected = 0;


        // when
        Integer actual  = CatHouse.getNumberOfCats();


        // then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getCatByIdTest() {
        // given
        CatHouse.clear();
        Cat cat = new Cat("Henry", new Date(), 12 );
        CatHouse.add(cat);
        CatHouse.getCatById(12);
        Integer expected = 12;


        // when
        Integer actual  = cat.getId();


        // then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void getNumberOfCats() {
        // given
        CatHouse.clear();
        Cat cat = new Cat("Henry", new Date(), 12 );
        CatHouse.add(cat);
        Integer expected = 1;


        // when
        Integer actual  = CatHouse.getNumberOfCats();


        // then
        Assert.assertEquals(expected, actual);
    }
}


