package animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian on 2017-03-01.
 */
public class AnimalTest {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal[] animals = new Animal[]{cat, dog};
        for (Animal animal : animals) {
            animal.makeVoise();
        }
        List<Animal> animalList = new ArrayList<>();
        animalList.add(cat);
        animalList.add(dog);
        for (Animal animal : animalList) {
            animal.makeVoise();
        }


    }
}
