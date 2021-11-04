public class Main {
    public static void main(String[] args) {

        //laver et nyt anaimal object
        Animal animal = new Animal(6, "peter", 1);
        //kalder sound metoden på animal objectet
        animal.sound();
        //kalder walk metoden på animal objectet
        animal.walk();

        //laver et nyt katte object
        Cat cat = new Cat(4, "mimi", 8);
        //kalder sound metoden på katte objectet, den vil ikke printe "animal sound" men
        // "Mioow" da sound metoden er blevet @Override i Cat-Klassen
        cat.sound();
        //kalder walk metoden på katte objectet, den vil printe "im walking" da denne metode
        //ikke er blevet @Override og den derfor vil blive kaldt direkte fra parent-klassen(Animal)
        cat.walk();

        //laver et nyt hunde object
        Dog dog = new Dog(4, "Fido", 4);
        //kalder sound metoden på hunde objectet, den vil ikke printe "animal sound" men
        // "wuf" da sound metoden er blevet @Override i Dog-Klassen
        dog.sound();
        //kalder walk metoden på hunde objectet, den vil printe "im walking" da denne metode
        //ikke er blevet @Override og den derfor vil blive kaldt direkte fra parent-klassen(Animal)
        dog.walk();
    }
}
