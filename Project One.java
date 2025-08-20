class User {
 String name;

  User(String name) {
     this.name = name;
 }

 void displayUser() {
     System.out.println("User Name: " + name);
 }
}
class Student extends User {
 int studentId;

  Student(String name, int studentId) {
     super(name);
     this.studentId = studentId;
 }

 void displayStudent() {
     System.out.println("Student Name: " + name + ", ID: " + studentId);
 }
}

public class UpcastingDowncastingDemo {
 public static void main(String[] args) {
          User u = new Student("Sasikumar", 126);  
          u.displayUser();  
          Student s = (Student) u; 
          s.displayUser();     
          s.displayStudent();  
 }
}

