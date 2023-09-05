package seminar3.task3;

import java.util.ArrayList;

public class AnimalList {
    ArrayList<Animal> animals = new ArrayList<>();

//    public void addAnimal(Animal... animals) {
//        this.animals.addAll(Arrays.asList(animals));
//    }
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void removeAnimal(Animal animal) throws AnimalNotFoundException {
        if (!animals.contains(animal)){
            throw new AnimalNotFoundException("Данное животное отсутствует в списке!");
        }
        animals.remove(animal);
    }

    public void removeAnimal(int index) throws AnimalNotFoundException {
        if (index > animals.size()-1){
            throw new AnimalNotFoundException("Нет животного под таким индексом.");
        }
        animals.remove(index);
    }
    public void printAnimals(){
        System.out.println(animals);
    }
}
