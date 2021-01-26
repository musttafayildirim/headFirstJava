public class TestGenerics1 {
    public static void main(String[] args) {
        new TestGenerics1().go();
    }

    private void go() {
        Animal[] animals = {new Dog(), new Cat(), new Dog()};
        Dog[] dogs = {new Dog(), new Dog(), new Dog()};
        takeAnimals(animals);
        takeAnimals(dogs);
    }

    private void takeAnimals(Animal[] animals) {
        for (Animal a: animals)
            a.eat();
    }

    private class Animal {
        void eat(){
            System.out.println("Animal eating");
        }
    }

    private class Dog extends Animal {
        public Dog(){
            System.out.println("bark");
        }
        void bark(){ }
    }

    private class Cat extends Animal {
        public Cat(){
            System.out.println("meow");
        }
        void meow(){}
    }
}
