import java.util.Scanner;

class Student{
  String name;
  int age;
  int rollNo;
  int marks;

  void input(){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your Name: ");
    name = sc.nextLine();

    System.out.print("Enter your Age: ");
    age = sc.nextInt();

    System.out.print("Enter Roll No: ");
    rollNo = sc.nextInt();

    System.out.print("Enter Marks: ");
    marks = sc.nextInt();
  }

  void display(){
    System.out.println("----Students Details----");
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);
    System.out.println("Roll No : " + rollNo);
    System.out.println("Marks : " + marks);
    System.out.println("------------------------");
  }
}
public class PrintStudentDetails{
  public static void main(String[] args) {
      Student s = new Student();
      s.input();
      s.display();
  }
}