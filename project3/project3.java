package project3;

public class project3 {
    public static void main(String[] args) {
        Student itamar = new Student(new double[] { 90, 95, 100 }, "Itamar", "334855616");
        Student tal = new Student("Tal", "33123043");
        tal.addGrade(57);
        System.out.println(itamar.getStudentAverage());
        System.out.println(Student.getClassAverage());
    }
}
