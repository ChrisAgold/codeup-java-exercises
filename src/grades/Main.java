package grades;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student tim = new Student("tim");
        tim.addGrade(70);
        tim.addGrade(90);

        System.out.println(tim.getName());

    }
}




