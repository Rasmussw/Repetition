public class Cat extends Animal{

    public Cat(int numberOfLegs, String name, int age) {
        super(numberOfLegs, name, age);
    }

    @Override
    public void sound(){
        System.out.println("Mioow");
    }

}
