package rocks.zipcodewilmington.animals;

import rocks.zipcodewilmington.Food;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public abstract class Mammal implements Animal {
    private final Integer id;
    private ArrayList<Food> eatenMeals;
    private String name;
    private Date birthDate;

    public Mammal(String name, Date birthDate, Integer id) {
        this.name = name;
        this.birthDate = birthDate;
        this.eatenMeals = new ArrayList<>();
        this.id = id;
    }

    public String getName() {
        return name;
    }        //  GETTER NAME

    public void setName(String name) {              // SETTER NAME
        this.name = name;
    }

    public Date getBirthDate() {                    // GETTER BIRTHDATE

        return birthDate;
    }

    public void setBirthDate(Date birthDate) {     // SETTER BIRTHDATE

        this.birthDate = birthDate;
    }


    public Integer getNumberOfMealsEaten() {      // GETTER MEALS

        return eatenMeals.size();
    }

    public void eat(Food food) {                  // EAT METHOD

        eatenMeals.add(food);
    }

    @Override
    public Integer getId() {
        return id;
    }       // GETTER ID


}
