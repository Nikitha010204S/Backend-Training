//Create a class Car with attributes like brand, model, and price. Write methods to display
// details of a car and calculate the discounted price.

package Day_2.OOPsBasic;

public class Car_Class_Objects {
        private  String brand;
        private String model;
        private int price;
        Car_Class_Objects(String brand, String model, int price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
    }
    public void display()
    {
        System.out.println("CAR DETAILS :");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);

    }

    public int discounted_price()
    {
        int discounted_price = 10;
        int finalPrice = price - (price * discounted_price / 100);
        System.out.println(finalPrice);
        return finalPrice;
    }
    public static void main(String[] args) {
            Car_Class_Objects c1=new Car_Class_Objects("Audi","2024",50000);
            c1.display();
            c1.discounted_price();
    }
}

