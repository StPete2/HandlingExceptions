package seminar3.task3;
//Задача: Работа с животными
// Представьте, что у вас есть простое приложение для управления списком животных.
// Вам нужно реализовать классы для добавления, удаления и вывода информации о животных.
// Также нужно предусмотреть обработку исключений в случае ошибок.В этом примере
// используются следующие концепции исключений:
//
//        Создание собственного исключения AnimalNotFoundException.
//        Обработка исключения на низком уровне (в методе removeAnimal класса AnimalList).
//        Обработка исключения на высоком уровне (в методе main класса AnimalApp).
public class Main {
    public static void main(String[] args) throws AnimalNotFoundException {

        Animal cat = new Animal("cat");
        Animal dog = new Animal("dog");
        Animal bird = new Animal("bird");

        AnimalList animals = new AnimalList();
        animals.addAnimal(cat);
        animals.addAnimal(dog);
        animals.addAnimal(bird);

        animals.printAnimals();
        animals.removeAnimal(0);
        animals.printAnimals();
        try {
            animals.removeAnimal(1);
            animals.removeAnimal(cat);
        } catch (AnimalNotFoundException exception) {
            System.out.println("Ошибка: " + exception.getMessage());
        }
        animals.printAnimals();
    }
}
