public class Animal {
private int numberOfLegs;
private String name;
private int age;

    public Animal(int numberOfLegs, String name, int age) {
        this.numberOfLegs = numberOfLegs;
        this.name = name;
        this.age = age;
    }

    public void sound(){
        System.out.println("Animal sound");
    }

    public void walk(){
        System.out.println("Im walking");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "numberOfLegs=" + numberOfLegs +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
