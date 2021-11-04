import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Integer> getArrayListFrom1To100(){
        ArrayList<Integer>integers = new ArrayList<Integer>();

        for (int i = 1; i < 101; i++) {
            integers.add(i);
        }

        return integers;
    }

    public static void romoveNumbersFromList(int number){
        ArrayList<Integer>integers = getArrayListFrom1To100();
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) % number == 0 && integers.get(i) != number){
                integers.remove(i);
            }
        }
        System.out.println(integers);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Type in a number, to remove all multiplies of that number");

        int input = scanner.nextInt();

        System.out.println("The list before" + "\n" + getArrayListFrom1To100());
        System.out.println("the list after");

        romoveNumbersFromList(input);
    }
}
