package project3;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final List<Double> scores = new ArrayList<>(); // create new list for the scores of the student
    private final String name;
    private final String id;
    private static List<Student> students = new ArrayList<>(); // create a new static list for students

    public Student(String identfier, String name) {
        this(new double[] {}, identfier, name); // create without defualt scores
    }

    public Student(double[] scores, String identfier, String name) { // main constructor
        this.name = name;
        this.id = identfier;
        addGrade(scores);
        students.add(this); //add self to global students list
    }

    public void addGrade(double newGrade) {
        scores.add(newGrade);
    }

    public void addGrade(double[] newGrades) { // add a list of grades
        for (double grade : newGrades) { // loop for all grades in newGrades array and add them
            scores.add(grade); 
        }

    }

    public String getName() { // getter for name
        return name;
    }

    public String getId() { //getter for id
        return id;
    }

    public double getStudentAverage() { //return average of single student
        double currentTotal = 0;
        for (double num : scores) {
            currentTotal += num; // add together all the scores
        }
        return currentTotal / scores.size(); // divide by number of scores and return
    }

    public static double getClassAverage() { //return average of all students
        double total = 0;
        double scoresCount = 0;
        for (Student student : students) {
            for (double score : student.scores) { // get every score of every student
                scoresCount++;  // get the amount of scores
                total+=score; // get the total of all scores
            }
        }
        return total / scoresCount; // calculate average
    }

}
