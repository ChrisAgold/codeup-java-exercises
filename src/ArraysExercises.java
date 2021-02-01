import arrays.Instructor;

import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        System.out.println();

        Person person1 = new Person("John");
        Person person2 = new Person("Sam");
        Person person3 = new Person("Donkey");

        Person[] people = {person1, person2, person3};
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }
    }

}