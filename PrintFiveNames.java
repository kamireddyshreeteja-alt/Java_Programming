import java.util.Scanner;
public class PrintFiveNames{
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String[] names = new String[5];
     System.out.println("Enter five names:"); 
     for(int i = 0; i < 5;i++){
      System.out.println("Enter name "+ (i+1) + ": ");
      names[i] = sc.nextLine();
     }
      System.out.println("\nAll 5 Names are:");
      for(int i = 0; i < 5;i++){
        System.out.println((i+1)+". "+ names[i]);
      }
     sc.close();
  }
}