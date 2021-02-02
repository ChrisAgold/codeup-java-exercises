import arrays.Instructor;

import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers);

        // Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person          in the array.
        // Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an           array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

        // Person[] people = new Person[3];
        Person John = new Person("John");
        Person Sam = new Person("Sam");
        Person Donkey = new Person("Donkey");

        // put all 3 people into array
        Person[] people = {John, Sam, Donkey};
        System.out.println(people);

        Person wonderWoman = new Person("Diana");
        Arrays.toString(addPerson(people, wonderWoman));

    }

    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] morePeople = Arrays.copyOf(people, people.length+1);
        morePeople[morePeople.length-1] = newPerson;
        return morePeople;
    }


}