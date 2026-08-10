import java.util.Scanner;
public class PrintAge{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your age: ");
      int age = sc.nextInt();
      System.out.println("My age is "+ age);
      sc.close();
  }
}