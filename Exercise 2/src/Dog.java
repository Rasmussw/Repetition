public class Dog extends Animal{

    public Dog(int numberOfLegs, String name, int age) {
        super(numberOfLegs, name, age);
    }

    @Override
    public void sound(){
        System.out.println("wuf");
    }
}
