import java.util.ArrayList;

class Student {
    String name;
    double gpa;

    Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
}

public class StudentList {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("Ali", 3.8));
        students.add(new Student("Sara", 1.7));
        students.add(new Student("John", 2.5));
        students.add(new Student("Maha", 3.6));
        students.add(new Student("Usman", 1.4));
        students.add(new Student("Zara", 3.2));
        students.add(new Student("Bilal", 3.9));

        int i = 0;
        while (i < students.size()) {
            if (students.get(i).gpa < 2.0) {
                students.remove(i);
            } else {
                i++;
            }
        }

        Student topper = students.get(0);
        for (i = 1; i < students.size(); i++) {
            if (students.get(i).gpa > topper.gpa) {
                topper = students.get(i);
            }
        }

        int deansCount = 0;
        for (i = 0; i < students.size(); i++) {
            if (students.get(i).gpa > 3.5) {
                deansCount++;
            }
        }

        System.out.println("Remaining Students:");
        for (i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).name + " - GPA: " + students.get(i).gpa);
        }

        System.out.println();
        System.out.println("Topper: " + topper.name + " with GPA " + topper.gpa);
        System.out.println("Students eligible for Dean's List: " + deansCount);

    }
}
