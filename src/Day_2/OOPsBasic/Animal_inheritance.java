//Create a class Animal with a method speak(). Derive classes Dog and Cat and override the speak()
// method to display appropriate sounds.

package Day_2.OOPsBasic;

class Animal {
    public void speak() {
        System.out.println("I'm speaking animal");
    }
}


    class Dog extends Animal {
        public void speak() {
            System.out.println("I'm speaking dog");
        }

    }

    class Cat extends Animal {
        public void speak() {
            System.out.println("I'm speaking cat");
        }
    }

    public class Animal_inheritance
    {

    public static void main(String args[]) {


        Dog d = new Dog();
        d.speak();
        Cat c = new Cat();
        c.speak();

    }
}


