import java.util.Scanner;
public class StudentResult {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter student name: ");
    String name = sc.nextLine();

    System.out.print("Enter marks in java: ");
    int java = sc.nextInt();

    System.out.print("Enter marks in dbms: ");
    int dbms = sc.nextInt();

    System.out.print("Enter marks in ai: ");
    int ai = sc.nextInt();

    int total = java + dbms + ai;

    double average = (double) total / 3;

    boolean passed = java >= 40 && dbms >= 40 && ai >= 40;

    boolean distinction = passed && average >= 75;

    boolean specialAward = passed && average >= 90;

    System.out.println("\n-----STUDENT RESULT-----");
    System.out.println("Name : "+ name);
    System.out.println("Java : "+ java);
    System.out.println("DBMS : "+ dbms);
    System.out.println("AI : "+ ai);
    System.out.println("Total : "+ total);
    System.out.println("Average : "+ average);

    if(passed){
      System.out.println("Result : PASS");
    }else{
      System.out.println("Result : FAIL");
    }

    if(distinction){
      System.out.println("Distinction : YES");
    }else{
      System.out.println("Distinction : NO");
    }

    if(specialAward){
      System.out.println("Special Award : YES");
    }else{
      System.out.println("Special Award : NO");
    }
    sc.close();
  }
}