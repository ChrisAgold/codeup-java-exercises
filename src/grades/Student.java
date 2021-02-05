package grades;

import java.util.ArrayList;

public class Student {
//    public static void main(String[] args) {
//        Student tim = new Student("tim");
//        tim.addGrade(70);
//        tim.addGrade(90);
//        System.out.println(tim.grades);
//    }

    // Variables
    private String name;
    private ArrayList<Integer> grades;

    // CONSTRUCTOR
    public Student(String name) {
        grades = new ArrayList<>();
        this.name = name;
    }

//    public Student(String name, ArrayList<Integer> grades) {
//        this.name = name;
//        this.grades = grades;
//    }

    // GETTER
    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    // METHODS
    // returns the student's name
    // public String getName();

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
//    public double getGradeAverage() {
//        return (double) grades.add(grade) / grades.size;
//    }

}