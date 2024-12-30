//Create a base class Animal with a method sound(). Derive two classes Dog and Cat from Animal.
// Override the sound() method to print “Bark” for Dog and “Meow” for Cat.
package Day_3.Inheritance_2;

public class Animal {
    public void sound()
    {
        System.out.println("I'm a sound");
    }
}
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}
class Main2
{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        Animal b = new Cat();
        b.sound();
    }
}
