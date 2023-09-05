package seminar3.task2;

class Animal {
    void makeSound() throws HungryCatException {
// Общая реализация для всех животных
    }
}

//class Cat extends Animal {
//    @Override
//    void makeSound() {
//        System.out.println("Мяу-мяу");
//    }
//}
class Cat extends Animal {
    private boolean isHungry;

    Cat(boolean isHungry) {
        this.isHungry = isHungry;
    }

    @Override
    void makeSound() throws HungryCatException {
        if (isHungry) {
            throw new HungryCatException("Кошка голодна и не может издать звук");
        }
        System.out.println("Мяу-мяу");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Гав-гав");
    }
}