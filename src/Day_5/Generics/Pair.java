//Create a generic class Pair<K, V> to hold a key-value pair. Write a program to store and
// display pairs of different data types, like <String, Integer> or <Integer, String>.
package Day_5.Generics;

public class Pair<K,V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public String display() {
        return key + " = " + value;
    }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Ram", 70);
        Pair<Integer,Integer> p2=new Pair<>(100,80);
        Pair<Integer,String> p3=new Pair<>(50,"Rahu");
        System.out.println("Pair 1 : "+p1.display());
        System.out.println("Pair 2 : "+p2.display());
        System.out.println("Pair 3 : "+p3.display());

    }
}

