package school;

import school.Teacher;
import school.Student;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mr. Kumar", "Mathematics");
        Student s1 = new Student("Sasi", 101);

        System.out.println("--- Teacher Details ---");
        t1.display();

        System.out.println("\n--- Student Details ---");
        s1.display();
    }
}